package controllers;

import java.util.Scanner;

import models.MachineModel;
import models.ProductModel;
import models.PurchaseModel;
import utils.Line;

public class PurchaseController {
    private Scanner scanner = new Scanner(System.in);
    private PurchaseModel purchaseModel;
    private Line line;

    public PurchaseController(PurchaseModel purchaseModel, Line line) {
        this.purchaseModel = purchaseModel;
        this.line = line;
    }

    public void purchase(MachineModel machine) {
        line.printDoubleLine();

        purchaseModel.showProductSelection(machine.listOfProducts());
        final ProductModel selectedProduct = purchaseModel.selectProduct(machine.listOfProducts());
        double moneyDeposited = selectTypeMoney(machine);

        while (moneyDeposited < selectedProduct.price) {
            System.out.println("Dinero insuficiente. Ingrese más dinero:");
            moneyDeposited += scanner.nextDouble();
        }

        final double change = moneyDeposited - selectedProduct.price;
        String messageChange = purchaseModel.returnChange(change, machine);

        printTicket(selectedProduct, messageChange);
    }

    public double selectTypeMoney(MachineModel machine) {
        boolean exit = false;
        double moneyDeposited = 0;

        do{
            line.printLineOfHyphens();
            System.out.println("Seleccione el tipo de pago: ");
            System.out.println("[1] Billetes");
            System.out.println("[2] Monedas");
            System.out.println("[3] Salir");
            System.out.println("----------------   Elige una opcion: ");
            String option = "";
            option = scanner.nextLine();

            if(option.equals("1"))
                moneyDeposited = purchaseModel.depositMoney(machine.listOfBills());
            else if(option.equals("2"))
                moneyDeposited = purchaseModel.depositMoney(machine.listOfCoins());
            else if(option.equals("3")){
                System.out.println("Saliendo...");
                exit = true;
            }
            exit = true;
        }while(!exit);

        return moneyDeposited;
    }

    public void printTicket(ProductModel product, String messageChange) {
        line.printLineOfHyphens();
        System.out.println("Gracias por su compra. Aquí tiene su " + product.name + ".");

        if (!messageChange.isEmpty()) {
            System.out.println("Su cambio es: \n" + messageChange);
        }
    }

}

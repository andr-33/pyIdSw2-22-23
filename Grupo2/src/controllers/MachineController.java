package controllers;

import java.util.List;
import java.util.Scanner;

import models.MachineModel;
import utils.Line;

public class MachineController {
    static Scanner input = new Scanner(System.in);
    private PurchaseController purchaseController;
    private Line line;
    
    public MachineController(PurchaseController purchaseController, Line line) {
        this.purchaseController = purchaseController;
        this.line = line;
    }

    public void machineSelection(List<MachineModel> machines) {
        boolean exit = false;

        do{
            line.printLineOfHyphens();
            System.out.println("[1]" + machines.get(0).showName());
            System.out.println("[2]" + machines.get(1).showName());
            System.out.println("[3]" + machines.get(2).showName());
            System.out.println("[4] Salir");
            System.out.println("----------------   Elige una opcion: ");
            String option = "";
            option = input.nextLine();

            if(option.equals("1"))
                this.purchaseController.purchase(machines.get(0));
            else if(option.equals("2"))
                this.purchaseController.purchase(machines.get(1));
            else if(option.equals("3"))
                this.purchaseController.purchase(machines.get(2));
            else if(option.equals("4")){
                System.out.println("Saliendo...");
                exit = true;
            }
            exit = true;
        }while(!exit);
    }
}

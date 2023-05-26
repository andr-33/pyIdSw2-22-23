package models;

import controllers.MoneyController;

import java.util.List;
import java.util.Scanner;

public class PurchaseModel {
    private Scanner scanner = new Scanner(System.in);
    final MoneyController moneyController = new MoneyController();

    public String returnChange(double change, MachineModel machine){
        final String[] changes = String.valueOf(change).split("\\.");
        int billPart = Integer.parseInt(changes[0]);
        int coinPart = (int) (Double.parseDouble("0."+changes[1]) *100);
        double highestBillValue = moneyController.getHighestValue(machine.listOfBills());
        double highestCoinValue = (moneyController.getHighestValue(machine.listOfCoins()) * 100);
        return outputMessageBills(billPart,(int)highestBillValue, machine.listOfBills()) + outputMessageCoins(coinPart,(int)highestCoinValue, machine.listOfCoins());
    }

    private String outputMessageBills(int change, int moneySize, List<MoneyModel> bills){
        if(change == 0){
            return "\n";
        }
        int quantity = change/moneySize;
        int remainder = change%moneySize;
        int nextSize = nextBillSize(moneySize);
        String text = "";

        MoneyModel descountBill = getMoneyModelByValue(moneySize, bills);
        int billCurrentQuantity = descountBill.quantity;
        descountBill.updateQuantity(billCurrentQuantity-quantity);

        if(quantity != 0){
            text = "$"+moneySize+" x "+quantity+"\n";
        }

        return text + outputMessageBills(remainder, nextSize, bills);
    }

    private String outputMessageCoins(int change, int moneySize, List<MoneyModel> coins){
        if(change == 0){
            return "-------------"+"\n";
        }
        int quantity = change/moneySize;
        int remainder = change%moneySize;
        int nextSize = nextCoinSize(moneySize);
        String text = "";
        double representativeValue = (double) moneySize/100;

        MoneyModel descountCoin = getMoneyModelByValue(representativeValue, coins);
        System.out.println("Moneda: "+descountCoin.value+" Cantidad: "+descountCoin.quantity);
        int coinCurrentQuantity = descountCoin.quantity;
        descountCoin.updateQuantity(coinCurrentQuantity-quantity);
        System.out.println("Moneda: "+descountCoin.value+" Cantidad nueva: "+descountCoin.quantity);

        if(quantity != 0){
            text = "$"+representativeValue+" x "+quantity+"\n";
        }

        return text + outputMessageBills(remainder, nextSize, coins);
    }

    private int nextBillSize(int moneySize){
        int nextSize = 0;
        switch (moneySize){
            case 20: nextSize= 10; break;
            case 10: nextSize= 5; break;
            case 5: nextSize= 2; break;
            case 2: nextSize= 1; break;
        }
        return nextSize;
    }

    private int nextCoinSize(int moneySize){
        int nextSize = 0;
        switch (moneySize){
            case 50: nextSize= 20; break;
            case 20: nextSize= 5; break;
        }
        return nextSize;
    }

    public void showProductSelection(List<ProductModel> products) {
        System.out.println("Seleccione un producto:");

        for (int i = 0; i < products.size(); i++) {
            final ProductModel product = products.get(i);
            System.out.println((i + 1) + ". " + product.name + " - $" + product.price);
        }
    }
    
    public ProductModel selectProduct(List<ProductModel> products) {
        System.out.println("Ingrese el número del producto que desea comprar:");

        final int optionProduct = this.scanner.nextInt();
        return products.get(optionProduct - 1);
    }

    private Boolean correctBillSize(double moneySize, List<MoneyModel> moneyList){
        MoneyModel moneyShell = new MoneyModel(moneySize, 0);
        for(MoneyModel money:moneyList){
            if (money.compareTo(moneyShell)==0){
                return true;
            }
        }
        System.out.println("Debes ingresar un monto valido");
        return false;
    }

    private MoneyModel getMoneyModelByValue(double value, List<MoneyModel> moneyList){
        MoneyModel moneyShell = new MoneyModel(value, 0);
        for (MoneyModel moneyModel:moneyList) {
            if(moneyModel.compareTo(moneyShell) == 0){
                return moneyModel;
            }
        }
        return moneyShell;
    }

    private void printList(List<MoneyModel> list){
        for(MoneyModel money:list){
            System.out.println("Dinero: "+money.value);
            System.out.println("Cantidad: "+money.quantity);
            System.out.println("-------------------------");
        }
    }
    
    public double depositMoney(List<MoneyModel> moneyList) {
        boolean correctSize = true;
        double sizeMoney = 0;
        do{
            System.out.println("Ingrese el tamaño: ");
            sizeMoney = scanner.nextDouble();
            correctSize = correctBillSize(sizeMoney, moneyList);
        }
        while (!correctSize);

        MoneyModel billSelect = getMoneyModelByValue(sizeMoney, moneyList);

        System.out.println("Ingrese la cantidad: ");
        double quantity = scanner.nextDouble();
        double currentQuantity = billSelect.quantity;
        billSelect.updateQuantity(((int)quantity + (int)currentQuantity));

        double balance = billSelect.value * quantity;
        return balance;
    }


}

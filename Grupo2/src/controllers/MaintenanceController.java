package controllers;

import java.util.List;

import models.MachineModel;
import models.ProductModel;

public class MaintenanceController {
    private int totalQuantity;
    private double percentage;

    public void checkAndRefillProducts(List<MachineModel> machines){

        int currentQuantity  = 0;
        int calculatedQuantity  = 0;

        if (totalQuantity == 0) {
            calculateTotalQuantity(machines);
        }

        for (MachineModel machine : machines) {
            for (ProductModel product : machine.listOfProducts()) {
                calculatedQuantity  += product.getQuantity();
                currentQuantity  = calculatedQuantity  / machines.size();
            }
        }

        if(currentQuantity  <= percentage){
            System.out.println("Surtiendo productos......");
            for (MachineModel machine : machines) {
                for (ProductModel product : machine.listOfProducts()) {
                    product.updateQuantity(10);
                }
            }
            System.out.println("Productos surtidos exitosamente!");
        }

    }

    private void calculateTotalQuantity(List<MachineModel> machines) {
        int totalGlobalQuantity = 0;
        int totalQuantityPerMachine = 0;

        for (MachineModel machine : machines) {
            for (ProductModel product : machine.listOfProducts()) {
                totalGlobalQuantity += product.getQuantity();
                totalQuantityPerMachine = totalGlobalQuantity / machines.size();
            }
        }

        totalQuantity = totalQuantityPerMachine;

        percentage = totalQuantity * 0.25;
    }


}

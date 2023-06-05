package controllers;

import java.util.List;

import models.MachineModel;
import models.ProductModel;

public class MaintenanceController {
    public void checkAndRefillProducts(List<MachineModel> machines){
        for(MachineModel machine : machines){
            for(ProductModel product : machine.listOfProducts()){
                if (product.getQuantity() < 7){
                    product.updateQuantity(10);
                }
            }
        }
    }
}

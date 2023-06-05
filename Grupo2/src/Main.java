import java.util.ArrayList;
import java.util.List;

import controllers.*;
import models.*;
import utils.Line;
import views.MachineView;
import views.ProductView;
import views.PurchaseView;

class Main {
    public static void main(String[] args) {
        final Line line = new Line(84);

        final PurchaseModel purchaseModel = new PurchaseModel();

        final MoneyController moneyController = new MoneyController();
        final ProductController productController = new ProductController();
        final PurchaseController purchaseController = new PurchaseController(purchaseModel, line);
        final MachineController machineController = new MachineController(purchaseController, line);
        final MaintenanceController maintenanceController = new controllers.MaintenanceController();

        final ProductView productsView = new ProductView(line);
        final MachineView machineView = new MachineView(line);
        final PurchaseView purchaseView = new PurchaseView(machineController, purchaseController, maintenanceController ,line);

        final List<MachineModel> machines = generateMachines(moneyController, productController);

        machineView.printMachineName(machines);
        productsView.printProducts(machines);
        purchaseView.purchaseMenu(machines);
    }

    public static List<MachineModel> generateMachines(MoneyController moneyController, ProductController productController) {
        final List<MoneyModel> billsMachine01 = moneyController.createBillList(3,1,2,5,10);
        final List<MoneyModel> coinsMachine01 = moneyController.createCoinList(10, 20, 10);

        final List<MoneyModel> billsMachine02 = moneyController.createBillList(3, 2, 3, 7, 15);
        final List<MoneyModel> coinsMachine02 = moneyController.createCoinList(25, 30, 20);

        final List<MoneyModel> billsMachine03 = moneyController.createBillList(3, 1, 3, 5, 12);
        final List<MoneyModel> coinsMachine03 = moneyController.createCoinList(30, 10, 15);

        final List<ProductModel> products = productController.createProductList();

        final List<MachineModel> machines = new ArrayList<MachineModel>();
        machines.add(new MachineModel("Maquina 1", billsMachine01, coinsMachine01, products));
        machines.add(new MachineModel("Maquina 2", billsMachine02, coinsMachine02, products));
        machines.add(new MachineModel("Maquina 3", billsMachine03, coinsMachine03, products));

        return machines;
    }

}

package models;

import java.util.List;

public class MachineModel {
    private String name;

    private List<MoneyModel> coins;

    private List<MoneyModel> bills;

    private List<ProductModel> products;

    public MachineModel(
        String name, List<MoneyModel> bills, List<MoneyModel> coins, List<ProductModel> products
    ) {
        this.name = name;
        this.coins = coins;
        this.bills = bills;
        this.products = products;
    }

    public void addBills(MoneyModel bill) {
        bills.add(bill);
    }

    public void addCoins(MoneyModel coin) {
        coins.add(coin);
    }

    public void addProducts(ProductModel product) {
        products.add(product);
    }

    public String showName() {
        return name;
    }

    public List<MoneyModel> listOfBills() {
        return bills;
    }

    public List<MoneyModel> listOfCoins() {
        return coins;
    }

    public List<ProductModel> listOfProducts() {
        return products;
    }

}

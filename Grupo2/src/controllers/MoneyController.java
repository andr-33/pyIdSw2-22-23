package controllers;

import models.MoneyModel;

import java.util.ArrayList;
import java.util.List;

public class MoneyController {
    public List<MoneyModel> createCoinList(int quantity1, int quantity2, int quantity3) {
        final List<MoneyModel> coins = new ArrayList<>();
        coins.add(new MoneyModel(0.50, quantity1));
        coins.add(new MoneyModel(0.20, quantity2));
        coins.add(new MoneyModel(0.05, quantity3));
        return coins;
    }

    public List<MoneyModel> createBillList(int quantity1, int quantity2, int quantity3, int quantity4, int quantity5) {
        final List<MoneyModel> bills = new ArrayList<>();
        bills.add(new MoneyModel(20, quantity1));
        bills.add(new MoneyModel(10, quantity2));
        bills.add(new MoneyModel(5, quantity3));
        bills.add(new MoneyModel(2, quantity4));
        bills.add(new MoneyModel(1, quantity5));
        return bills;
    }

    public double getHighestValue(List<MoneyModel> moneyList){
        double highestValue = 0;

        for (MoneyModel money: moneyList) {
            if(highestValue <  money.value){
                highestValue = money.value;
            }
        }
        return highestValue;
    }
}

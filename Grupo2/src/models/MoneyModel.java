package models;

public class MoneyModel{
    public double value;
    public int quantity;

    public MoneyModel(double value, int quantity){
        this.value = value;
        this.quantity = quantity;
    }

    public int compareTo(MoneyModel moneyShell){
        return (int) (this.value - moneyShell.value);
    }

    public void updateQuantity(int newQuantity){
        quantity = newQuantity;
    }

}

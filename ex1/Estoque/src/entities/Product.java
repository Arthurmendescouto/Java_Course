package entities;

public class Product {
    public  String name;
    public double price;
    public int quantity;

    public double totalValueInstock(){
        return quantity*price;
    }
    public void AddProducts(int quantity){
        this.quantity+=quantity;
    }

    public void removeProducts(int quantity){
        this.quantity-=quantity;
    }

}

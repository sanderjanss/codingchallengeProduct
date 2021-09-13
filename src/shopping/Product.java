package shopping;

public class Product {
    private String productName;
    private int amount;
    private double price;

    public Product(String productName, int amount, double price) {
        this.productName = productName;
        this.amount = amount;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public double calculateSubPrice(int amount, double price){
        return amount * price;
    }

    @Override
    public String toString() {
        return  "\nProductName: " + productName +
                ", Amount=" + amount +
                ", Price=" + price;
    }
}

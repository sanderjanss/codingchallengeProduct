package shopping;

import java.util.Arrays;

public class Invoice {
    private Product [] products;
    private double totalPriceInvoice;

    public Invoice(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public double getTotalPriceInvoice() {
        return totalPriceInvoice;
    }

    public void calculateTotalPrice(){
        for (Product product : products) {
            this.totalPriceInvoice += product.calculateSubPrice(product.getAmount(), product.getPrice());
        }
    }

    public String printInvoice(){
        calculateTotalPrice();
        return "Invoice Producten: \n"  + Arrays.toString(products) +
                    "\nTotal Price Invoice: " + totalPriceInvoice;
    }
}

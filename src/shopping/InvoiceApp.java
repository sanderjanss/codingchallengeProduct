package shopping;

public class InvoiceApp {
    public static void main(String[] args) {
        Product [] products = new Product[]{
                new Product("cola", 2, 1.5),
                new Product("bananas", 1, 4),
                new Product("biscuits", 4, 2.15),
                new Product("tesla", 1, 56000),
                new Product("shirts", 3, 12)
        };

        Invoice invoice = new Invoice(products);
        System.out.println(invoice.printInvoice());


    }




}

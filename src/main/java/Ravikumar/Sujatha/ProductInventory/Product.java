package Ravikumar.Sujatha.ProductInventory;

/**
 * Created by sujatharavikumar on 9/15/16.
 */
public class Product {

    private int id;
    private double price;
    private int quantity;


    public Product(int id, double price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

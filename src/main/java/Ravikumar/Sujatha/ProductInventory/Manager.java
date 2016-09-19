package Ravikumar.Sujatha.ProductInventory;

/**
 * Created by sujatharavikumar on 9/15/16.
 */
public class Manager {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        Product[] products = {new Product(1, 30, 5), new Product(2, 60, 3), new Product(3, 25, 7)};
        inventory.setProducts(products);

        System.out.println("Our inventory has the following products:");
        while (inventory.hasMoreProducts()){
            System.out.println(inventory.nextProduct().toString());
        }
    }
}

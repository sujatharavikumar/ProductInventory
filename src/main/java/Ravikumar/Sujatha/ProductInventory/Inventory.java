package Ravikumar.Sujatha.ProductInventory;
import java.util.Arrays;

/**
 * Created by sujatharavikumar on 9/15/16.
 */
public class Inventory {

    private int productIndex = 0;
    private Product[] products;


    public void setProducts(Product[] products) {
        this.products = products;
    }

    public boolean hasMoreProducts(){
        return (productIndex < products.length);
    }

    public Product nextProduct(){
        return (hasMoreProducts() ? products[productIndex++] : null);
    }


}

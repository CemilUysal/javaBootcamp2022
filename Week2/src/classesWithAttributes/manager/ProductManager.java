package classesWithAttributes.manager;

import classesWithAttributes.entity.Product;

public class ProductManager {
    public void add(Product product) {
        System.out.println(product.getName()+" Added!");
    }
    public void remove(Product product) {
        System.out.println(product.getName()+" Removed!");
    }
    public void update(Product product) {
        System.out.println(product.getName()+" Updated!");
    }
}

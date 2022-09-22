package classesWithAttributes;

import classesWithAttributes.entity.Product;
import classesWithAttributes.manager.ProductManager;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"phone33","bad",9000,2000,"black");
        //product.setName("ipek");
        //product.setId(3);
        //product.setDescription("nice");
        //product.setPrice(3000);

        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());



        ProductManager manager =new ProductManager();
        manager.add(product);
        manager.remove(product);
        manager.update(product);

    }
}

package Predicate;
import Predicate.entities.Product;
import Predicate.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 89.90));

        list.removeIf(new ProductPredicate());

        for(Product p : list) {
            System.out.println(p);
        }

    }

}

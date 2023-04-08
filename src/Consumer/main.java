package Consumer;

import Consumer.util.PriceUpdate;
import Consumer.entities.Product;
import java.util.ArrayList;
import java.util.List;

import java.util.Locale;

public class main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 89.90));

//        list.forEach(new PriceUpdate()); Implementação utilizando intertface

        double factor = 1.1;

        list.forEach(product -> product.setPrice(product.getPrice() * factor));

        list.forEach(System.out::println);

    }
}

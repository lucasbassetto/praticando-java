package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

            list.add(new Product("TV",900.00));
            list.add(new Product("Notebook",1200.00));
            list.add(new Product("Tablet",450.00));

//      Pode-se fazer assim também. Deste modo, não é preciso criar a classe MyComparator. Todas implementações abaixo são a mesma, muda apenas a sintaxe.
//        Comparator<Product> comp = (p1,p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };

//      Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//      list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        list.sort(Comparator.comparing((Product p) -> p.getName().toUpperCase()));

//      list.sort(comp);

//      list.sort(new MyComparator()); Com a expressão lambda, não é necessário a classe MyComparator
            for(Product p : list) {
                System.out.println(p);
            }

    }
}

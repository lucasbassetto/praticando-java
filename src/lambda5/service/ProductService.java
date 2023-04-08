package lambda5.service;


import lambda5.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredService(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for(Product p : list) {
            if(criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}

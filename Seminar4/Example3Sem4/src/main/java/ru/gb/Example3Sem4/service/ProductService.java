package Example3Sem4.src.main.java.ru.gb.Example3Sem4.service;

import Example3Sem4.src.main.java.ru.gb.Example3Sem4.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p){products.add(p);}

    public List<Product> findAll(){return  products;}
}

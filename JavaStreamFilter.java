/*Filtering Collection by using Stream*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;

    public Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;        
    }
}

public class JavaStreamFilter{
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(1,"Soap",100.0f));
        productList.add(new Product(2,"Shampoo",300.0f));
        productList.add(new Product(2,"Moisturizer",400.0f));
        productList.add(new Product(2,"Face-Wash",500.0f));
        productList.add(new Product(2,"Scrub",600.0f));

        List<Float> productPriceList =productList.stream()  
                                     .filter(p -> p.price < 300)  
                                     .map(p->p.price)      
                                     .collect(Collectors.toList());

        System.out.println(productPriceList);
    }
}
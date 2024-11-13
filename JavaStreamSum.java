//Sum by using Collectors Methods

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

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

public class JavaStreamSum {
    public static void main(String[] args) {
        List<Product> productsList =new ArrayList<>();
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));

        double sum=productsList.stream()
        .collect(Collectors.summingDouble(product->product.price));
        System.out.println("Sum of prices of all products: "+sum);
    }
}

//reduce() Method in Collection

import java.util.ArrayList;
import java.util.List;

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

public class JavaStreamReduce {
    public static void main(String[] args) {
        List<Product> productsList=new ArrayList<>();
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));

        Float totalPrice=productsList.stream().map(product->product.price)
        .reduce(0.0f,(sum,price)->sum+price);
        System.out.println(totalPrice);
    }
}

//Find Max and Min Product Price

import java.util.ArrayList;
import java.util.List;

class ProductList{
    int id;
    String name;
    float price;

    public ProductList(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;        
    }
}

public class JavaStreamMaxAndMin {
    public static void main(String[] args) {
        List<ProductList> productsList=new ArrayList<>();
        productsList.add(new ProductList(1,"HP Laptop",25000f));  
        productsList.add(new ProductList(2,"Dell Laptop",30000f));  
        productsList.add(new ProductList(3,"Lenevo Laptop",28000f));  
        productsList.add(new ProductList(4,"Sony Laptop",28000f));  
        productsList.add(new ProductList(5,"Apple Laptop",90000f));

        ProductList productA=productsList.stream()
        .max((product1,product2)->product1.price>product2.price?1:-1).get();
        System.out.println("Max Price: "+productA.price);

        ProductList productB=productsList.stream()
        .min((product1,product2)->product1.price>product2.price?1:-1).get();
        System.out.println("Min Price: "+productB.price);
    }
}

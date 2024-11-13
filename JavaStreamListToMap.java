//Convert List into Map

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

public class JavaStreamListToMap {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"HP Laptop",25000f));  
        list.add(new Product(2,"Dell Laptop",30000f));  
        list.add(new Product(3,"Lenevo Laptop",28000f));  
        list.add(new Product(4,"Sony Laptop",28000f));  
        list.add(new Product(5,"Apple Laptop",90000f));

        Map<Integer,String> map=list.stream()
        .collect(Collectors.toMap(p->p.id, p->p.name));

        System.out.println(map);
    }
}

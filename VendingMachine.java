import java.util.List;

public class VendingMachine {
    public void initProducts(List<Product> productsList){
        // Product product = productsList.get(0);
        Product product1 = new Product("Шоколад", 150);
        Product product2 = new HotDrink("Кофе", 220, .2, 70);
    
    }

    public void getProduct(String name){
        
    }

    public void getProduct(String name, double volume, double temperature){
        
    }

    public void restore(){
        System.out.println("Продукт выдан");
    }
}

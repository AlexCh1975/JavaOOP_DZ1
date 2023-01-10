import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {
    // @Override
    // public void initProducts(List<HotDrink> productList){
    //     HotDrink hd = productList.get(0);
    // }

    @Override
    public void restore(){
        System.out.println("Напиток выдан");
    }
}

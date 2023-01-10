import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> hd = new ArrayList<>();

        hd.add(new HotDrink("кофе", 220, .2, 70));
        hd.add(new HotDrink("чай", 100, .25, 90));
        hd.add(new HotDrink("какао", 160, .25, 80));

        Product chocolate = new Product("шоколад", 125);
        Product whiskey = new Drink("виски", 112, .1);
        List<VendingMachine> vm = new ArrayList<>();

        // vm.add(new VendingMachine());
        // System.out.println(chocolate);
        // System.out.println();

        chocolate.getProduct("шоколад");
        whiskey.getProduct("виски");
        for (HotDrink i : hd) {
            i.getProduct("чай");
        }

    }
}

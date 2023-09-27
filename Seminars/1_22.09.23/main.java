import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<BottleofWater> listProduct = new ArrayList<>();
        List<HotDrink> listHotProduct = new ArrayList<>();

        listProduct.add(new BottleofWater("OOPseminar", 7, 2));
        listProduct.add(new BottleofWater("OOPlec", 7, 1));
        listProduct.add(new BottleofWater("Dz", 5, 4));
        listProduct.add(new BottleofWater("Java", 20, 100));
        listProduct.add(new BottleofWater("Test", 11, 5));
        BottleOfWaterVendingMachine vendingMachin = new BottleOfWaterVendingMachine(listProduct);
        System.out.println(vendingMachin.getProduct("OOPseminar"));
        System.out.println(vendingMachin.getProduct("adjsl"));
        System.out.println(vendingMachin.getProduct("Test"));
        System.out.println(vendingMachin.getProduct("Test", 5));


        listHotProduct.add(new HotDrink("Tea", 20, 100,60));
        listHotProduct.add(new HotDrink("Сoffee", 11, 5,70));
        HotDrinksVendingMachine HotvendingMachin = new HotDrinksVendingMachine(listHotProduct);
        System.out.println(HotvendingMachin.getProduct("Tea"));
        System.out.println(HotvendingMachin.getProduct("Tea",100,60));

    }
}

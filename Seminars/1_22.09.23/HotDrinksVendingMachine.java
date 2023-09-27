import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    List<HotDrink> productList;

    public HotDrinksVendingMachine(List<HotDrink> productList) {
        this.productList = productList;
    }

   

    public HotDrink getProduct(String name, int volume, int temperature){
        for(HotDrink hotDrink: productList){
            if(hotDrink.getName().equals(name) && hotDrink.getVolume()== volume && hotDrink.getTemperature()== temperature){
                return hotDrink;
                }
            }
            return null;
        }
        
    public Product getProduct(String name){
        for(Product product: productList){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public void addHotDrink( HotDrink hotDrink){
        this.productList.add(hotDrink);
    }
    
}

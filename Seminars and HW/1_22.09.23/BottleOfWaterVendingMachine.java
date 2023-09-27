import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    List<BottleofWater> productList;

    public BottleOfWaterVendingMachine(List<BottleofWater> productList) {
        this.productList = productList;
    }

   

    public BottleofWater getProduct(String name, int volume){
        for(BottleofWater bottleOfWater: productList){
            if(bottleOfWater.getName().equals(name) && bottleOfWater.getVolume()== volume){
                return bottleOfWater;
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

    public void addBottleOfWatr( BottleofWater bottleOfWater){
        this.productList.add(bottleOfWater);
    }
    
}

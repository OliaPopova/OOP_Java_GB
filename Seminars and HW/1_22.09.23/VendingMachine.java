// import java.util.List;

public interface VendingMachine {
    public Product getProduct(String name);
}
    
    

    // мы не можем в интерфейсе делать реализацию методов
    // можно наследовать сколько хочешь интерфейсов, но только один класс
    // при этом обязательно реализовать всё, что есть в интерфейсе
    //при наследовании от класса не обязательно всё реализовывать
   
        // for (Product product : productlist){
        //     if (product.getName().equals(name)){
        //         return product;
        //     }
        // }
        // return null;
    
    //так как у нас интерфейс гетеры и сетеры нам не нужны
    // public List<Product> getProductList(){
    //     return productlist;
    // }

    // public void setProductList(List<Product> productlist){
    //     this.productlist = productlist;
    // }

    // public void initProductList (List<Product> productlist);
        // this.productlist = productlist;
    

package org.example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface="org.example.ShopCatalog")

public class ShopCatalogImpl implements ShopCatalog {

    ArrayList<Product> products = new ArrayList<>();
    @Override
    @WebMethod
   public boolean addProduct(String id,String categorie,double prix){
        return products.add(new Product(id,categorie,prix));
    }

    @Override
    @WebMethod
    public ArrayList<Product> getAllProducts(){
        return products;
    }
    @Override
    @WebMethod
    public Product getProduct(String id){
        for(Product product : products){
            if(product.getId().equals(id)){
                return product;
            }

        }
        return null;
    }
}

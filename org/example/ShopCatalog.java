package org.example;
import javax.jws.WebService;
import javax.jws.WebMethod;
import java.util.ArrayList;

@WebService
public interface ShopCatalog {
@WebMethod
    public boolean addProduct(String id,String categorie,double prix);
@WebMethod
    public ArrayList<Product> getAllProducts();

@WebMethod
    public Product getProduct(String id);
}

package org.example;
import javax.xml.ws.Endpoint;

public class ShopCatalogPublisher {
public static String uri="http://localhost:1234/ShopCatalogws";
    public static void main(String[] args) {
        Endpoint.publish(uri,new ShopCatalogImpl());
        System.out.println("Publisher is ready : "+uri+"?wsdl");
    }
}

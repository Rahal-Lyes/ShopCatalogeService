package org.example;

public class Product {
    private String id;
    private String categorie;
    private double prix;

    public Product(String id, String categorie,double prix){
        this.id = id;
        this.categorie = categorie;
        this.prix = prix;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCategorie() {
        return categorie;
    }
    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    public double getPrix() {
        return prix;

    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
}

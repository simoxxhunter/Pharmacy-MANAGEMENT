/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author user
 */
public class Products_Model {

    private int id_product;
    private String product_name;
    private int qte;
    private double price;
    private String description;

    public int id_product() {
        return id_product;
    }

    public void setid_product(int id_product) {
        this.id_product = id_product;
    }

    public String getproduct_name() {
        return product_name;
    }

    public void setproduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int Qte) {
        this.qte = Qte;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products_Model{" + "id_product=" + id_product + ", product_name=" + product_name + ", qte=" + qte + ", price=" + price + ", description=" + description + '}';
    }
    
}

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

    public class Products {

        private int id_product;
        private String product_name;
        private int qte;
        private double price;
        private String description;

        public int getId_produit() {
            return id_product;
        }

        public void setId_produit(int id_product) {
            this.id_product = id_product;
        }

        public String getNom_article() {
            return product_name;
        }

        public void setNom_article(String nom_article) {
            this.product_name = nom_article;
        }

        public int getQuantite() {
            return qte;
        }

        public void setQuantite(int quantite) {
            this.qte = quantite;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public double getPrix() {
            return price;
        }

        public void setPrix(double prix) {
            this.price = prix;
        }
    }
}

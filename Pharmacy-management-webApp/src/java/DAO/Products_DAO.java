/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DB_cnx.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Products_Model;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Products_DAO {
     Connection connect;
    
    public Products_DAO(){
        connect = DB_cnx.connection.getConnection();
    }
    
    public void AddProduct (Products_Model products){
        try {
            PreparedStatement prstmt = connect.prepareStatement("INSERT INTO products (ID_product, Qte, Price, description)"
                    + " VALUES (?, ?, ?, ?)");
            prstmt.setString(1, products.getproduct_name());
            prstmt.setInt(2,products.getQte());
            prstmt.setDouble(3, products.getPrice());
            prstmt.setString(4, products.getDescription());
            
            prstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Products_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Products_Model> ShowProducts(){
        List<Products_Model> products = new ArrayList<>();
        try{
            PreparedStatement prstmt = connect.prepareStatement("SELECT * from products");
            ResultSet res = prstmt.executeQuery();
            
            while(res.next()){
                Products_Model product = new Products_Model();
                
                product.setid_product(res.getInt("id_produit"));
                product.setproduct_name(res.getString("nom_article"));
                product.setQte(res.getInt("quantite"));
                product.setPrice(res.getFloat("prix"));
                product.setDescription(res.getString("description"));
                
                products.add(product);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return products;
    }
    
}

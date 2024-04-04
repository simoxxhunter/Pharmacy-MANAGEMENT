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
import model.Produit;

/**
 *
 * @author user
 */
public class Products_DAO {
     Connection connect;
    
    public Products_DAO(){
        connect = DB_cnx.getConnection();
    }
    
    public void ajouterProduit (Products products){
        try {
            PreparedStatement prstmt = connect.prepareStatement("INSERT INTO Produit (nom_article, quantite, prix, description)"
                    + " VALUES (?, ?, ?, ?)");
            prstmt.setString(1, products.getNom_article());
            prstmt.setInt(2,products.getQuantite());
            prstmt.setDouble(3, products.getPrix());
            prstmt.setString(4, products.getNom_article());
            
            prstmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Products_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import interfaces.IServicePersonne;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Personne;
import utils.MaConnexion;

/**
 *
 * @author admin
 */
public class ServicePersonne implements IServicePersonne{
    
    //var
    MaConnexion instance = MaConnexion.getInstance();
    Connection cnx = instance.getCnx();

    @Override
    public void createPersonne(Personne p) {
        
        //request
        String req = "INSERT INTO `personne`(`nom`, `prenom`, `age`, `cin`, `date`) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement st = cnx.prepareStatement(req);
            st.setString(1, p.getNom());
            st.setString(2, p.getPrenom());
            st.setInt(3, p.getAge());
            st.setString(4, p.getCin());
            st.setDate(5, p.getDate());
            st.executeUpdate(req);
            System.out.println("Personne ajoutée avec succes.");
            
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        }
        
        
    }

    @Override
    public List<Personne> readPersonnes() {
        ArrayList<Personne> personnes = new ArrayList();
        
        try {
            Statement st = cnx.createStatement();
            String req = "SELECT * FROM personne";
            ResultSet rs = st.executeQuery(req);
            
            while (rs.next()) {                
                
                personnes.add(new Personne(rs.getInt(1), rs.getString("nom"), rs.getString("prenom"), rs.getInt(3), rs.getString(4), rs.getDate(5)));
                
            }
            
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
        return personnes;
    }
    
    
    
    
    
    
    
}

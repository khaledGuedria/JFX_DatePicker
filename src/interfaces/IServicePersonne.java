/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Personne;

/**
 *
 * @author admin
 */
public interface IServicePersonne {
    
    //CRUD
    public void createPersonne(Personne p);
    public List<Personne> readPersonnes();
    
}

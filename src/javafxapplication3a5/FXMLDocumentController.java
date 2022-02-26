/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3a5;

import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Personne;
import services.ServicePersonne;

/**
 *
 * @author admin
 */
public class FXMLDocumentController implements Initializable {

    //var
    ServicePersonne sp = new ServicePersonne();
    
    //widgets
    @FXML
    private TextField nomTF;
    @FXML
    private TextField prenomTF;
    @FXML
    private Label showLabel;
    @FXML
    private TextField ageTF;
    @FXML
    private TextField cinTF;
    @FXML
    private DatePicker datePicker;

    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void addAction(ActionEvent event) {
        
        if (nomTF.getText().length() == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erreur");
            alert.setHeaderText("Erreur de saisie !");
            alert.setContentText("Vous navez pas saisie le nom");
            alert.show();

        } else {
            Date myDate = Date.valueOf(datePicker.getValue().toString());
            sp.createPersonne(new Personne(nomTF.getText(), prenomTF.getText(), Integer.parseInt(ageTF.getText()), myDate));
        }

    }

    @FXML
    private void afficherAction(ActionEvent event) {
        showLabel.setText(sp.readPersonnes().toString());
    }

}

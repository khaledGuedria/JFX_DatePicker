/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Personne {

    //var
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String cin;
    private Date date;

    //Constructor
    public Personne() {

    }
    //..

    public Personne(int id, String nom, String prenom, int age, String cin, Date date) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.cin = cin;
        this.date = date;
    }

    //..
    public Personne(String nom, String prenom, int age, Date date) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
    }

    //GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Personne{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", cin=" + cin + ", date=" + date + '}';
    }

}

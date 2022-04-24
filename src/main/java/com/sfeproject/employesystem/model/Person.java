package com.sfeproject.employesystem.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private int SOM;
    private char sexe;
    private String nom;
    private String prenom;
    private String telephone;
    private String lieuEmp;
    private String lieuHabit;
    private String password;
    private Date dateRec;
    private String cadre;

    public Person(int SOM, char sexe, String nom, String prenom, String telephone, String lieuEmp, String lieuHabit, String password, Date dateRec, String cadre) {
        this.SOM = SOM;
        this.sexe = sexe;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.lieuEmp = lieuEmp;
        this.lieuHabit = lieuHabit;
        this.password = password;
        this.dateRec = dateRec;
        this.cadre = cadre;
    }

    public Person() {

    }

    public int getSOM() {
        return SOM;
    }

    public void setSOM(int SOM) {
        this.SOM = SOM;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getLieuEmp() {
        return lieuEmp;
    }

    public void setLieuEmp(String lieuEmp) {
        this.lieuEmp = lieuEmp;
    }

    public String getLieuHabit() {
        return lieuHabit;
    }

    public void setLieuHabit(String lieuHabit) {
        this.lieuHabit = lieuHabit;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateRec() {
        return dateRec;
    }

    public void setDateRec(Date dateRec) {
        this.dateRec = dateRec;
    }

    public String getCadre() {
        return cadre;
    }

    public void setCadre(String cadre) {
        this.cadre = cadre;
    }
}

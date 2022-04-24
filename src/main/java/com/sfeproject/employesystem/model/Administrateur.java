package com.sfeproject.employesystem.model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Administrateur extends Person{

    public Administrateur(int SOM, int id, char sexe, String nom, String prenom, String telephone, String lieuEmp, String lieuHabit, String password, Date dateRec, String cadre) {
        super(SOM, sexe, nom, prenom, telephone, lieuEmp, lieuHabit, password, dateRec, cadre);
    }

    public Administrateur() {
    }
}

package com.sfeproject.employesystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "employe")
public class Employe extends Personne implements Serializable {

    private static final long serialVersionUID = 1L;

    public Employe() {
        super();
    }
}

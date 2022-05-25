package com.sfeproject.employesystem.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "employe")
public class Employe extends Personne implements Serializable {

    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy = "employe")
    @JsonManagedReference
    private List<DemandeConge> demandeCongeList;

    @OneToMany(mappedBy = "employe")
    @JsonManagedReference
    private List<DemandePiece> demandePieceList;

    @OneToMany(mappedBy = "employe")
    @JsonManagedReference
    private List<Realiser> affectationList;

    public Employe() {
        super();
    }

}

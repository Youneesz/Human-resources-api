package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@Entity
@Table(name = "demande_conge")
public class DemandeConge implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NUM_DEMANDE", nullable = false)
    private Integer numDemande;

    @Id
    @Column(name = "CODE_CONGE", nullable = false)
    private Integer codeConge;

    @Id
    @Column(name = "CODE_EMP", nullable = false)
    private Integer codeEmp;

    @Column(name = "DATE_DEMANDE")
    private Date dateDemande;

    @Column(name = "EXERCICE")
    private Integer EXERCICE;

    @Column(name = "DATE_DEBUT")
    private Date dateDebut;

    @Column(name = "DATE_FIN")
    private Date dateFin;

    @Column(name = "DATE_ETAT")
    private Date dateEtat;

    @Column(name = "ETAT")
    private String ETAT;

    @Column(name = "MOTIF")
    private String MOTIF;

}

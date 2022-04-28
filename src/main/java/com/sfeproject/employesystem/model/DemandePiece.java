package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "demande_piece")
@IdClass(DemandePieceId.class)
public class DemandePiece implements Serializable {

    public DemandePiece(Integer numDemande, Integer codeEmp, Integer codePiece, Date dateDemande, Date dateEtat, String etatDemande, String motifRefus) {
        this.numDemande = numDemande;
        this.codeEmp = codeEmp;
        this.codePiece = codePiece;
        this.dateDemande = dateDemande;
        this.dateEtat = dateEtat;
        this.etatDemande = etatDemande;
        this.motifRefus = motifRefus;
    }

    public DemandePiece() {}

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "NUM_DEMANDE", nullable = false)
    private Integer numDemande;

    @Id
    @Column(name = "CODE_EMP", nullable = false)
    private Integer codeEmp;

    @Id
    @Column(name = "CODE_PIECE", nullable = false)
    private Integer codePiece;

    @Column(name = "DATE_DEMANDE")
    private Date dateDemande;

    @Column(name = "DATE_ETAT")
    private Date dateEtat;

    @Column(name = "ETAT_DEMANDE")
    private String etatDemande;

    @Column(name = "MOTIF_REFUS")
    private String motifRefus;

}

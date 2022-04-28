package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "actualite")
public class Actualite implements Serializable {

    public Actualite() {}

    public Actualite(Integer codeActualite, Integer codeCat, Date dateActualite, String descActualite) {
        this.codeActualite = codeActualite;
        this.codeCat = codeCat;
        this.dateActualite = dateActualite;
        this.descActualite = descActualite;
    }

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE_ACTUALITE", nullable = false)
    private Integer codeActualite;

    @Column(name = "CODE_CAT", nullable = false)
    private Integer codeCat;

    @Column(name = "DATE_ACTUALITE")
    private Date dateActualite;

    @Column(name = "DESC_ACTUALITE")
    private String descActualite;

}

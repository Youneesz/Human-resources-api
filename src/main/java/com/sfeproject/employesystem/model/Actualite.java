package com.sfeproject.employesystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "actualite")
public class Actualite implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_ACTUALITE", nullable = false)
    private Integer codeActualite;

    @Column(name = "CODE_CAT", nullable = false)
    private Integer codeCat;

    @Column(name = "DATE_ACTUALITE")
    private Date dateActualite;

    @Column(name = "DESC_ACTUALITE")
    private String descActualite;

}

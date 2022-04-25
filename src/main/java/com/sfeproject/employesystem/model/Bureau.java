package com.sfeproject.employesystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "bureau")
public class Bureau implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_BUREAU", nullable = false)
    private Integer codeBureau;

    @Column(name = "INTITULE_BUREAU")
    private String intituleBureau;

    @Column(name = "DESCRIPTION_BUREAU")
    private String descriptionBureau;

}

package com.sfeproject.employesystem.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_ROLE", nullable = false)
    private Integer codeRole;

    @Column(name = "INTITULE_ROLE")
    private String intituleRole;

    @Column(name = "DESCRIPTION_ROLE")
    private String descriptionRole;

}

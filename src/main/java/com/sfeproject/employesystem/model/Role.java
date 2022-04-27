package com.sfeproject.employesystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CODE_ROLE", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer codeRole;

    @Column(name = "INTITULE_ROLE")
    private String intituleRole;

    @Column(name = "DESCRIPTION_ROLE")
    private String descriptionRole;

    public Role() {}

    public Role(String intituleRole, String descriptionRole) {
        this.intituleRole = intituleRole;
        this.descriptionRole = descriptionRole;
    }

    public Integer getCodeRole() {
        return codeRole;
    }

    public void setCodeRole(Integer codeRole) {
        this.codeRole = codeRole;
    }

    public String getIntituleRole() {
        return intituleRole;
    }

    public void setIntituleRole(String intituleRole) {
        this.intituleRole = intituleRole;
    }

    public String getDescriptionRole() {
        return descriptionRole;
    }

    public void setDescriptionRole(String descriptionRole) {
        this.descriptionRole = descriptionRole;
    }
}

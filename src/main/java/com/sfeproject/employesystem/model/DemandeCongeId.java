package com.sfeproject.employesystem.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DemandeCongeId implements Serializable {

    private Integer numDemande;
    private Integer codeConge;
    private Integer codeEmp;

    public DemandeCongeId () {}

    public DemandeCongeId(Integer numDemande, Integer codeConge, Integer codeEmp) {
        this.numDemande = numDemande;
        this.codeConge = codeConge;
        this.codeEmp = codeEmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemandeCongeId that = (DemandeCongeId) o;
        return numDemande.equals(that.numDemande) && codeConge.equals(that.codeConge) && codeEmp.equals(that.codeEmp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numDemande, codeConge, codeEmp);
    }
}

package com.sfeproject.employesystem.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DemandePieceId implements Serializable {

    private Integer numDemande;
    private Integer codeEmp;
    private Integer codePiece;

    public DemandePieceId() {}

    public DemandePieceId(Integer numDemande, Integer codeEmp, Integer codePiece) {
        this.numDemande = numDemande;
        this.codeEmp = codeEmp;
        this.codePiece = codePiece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemandePieceId that = (DemandePieceId) o;
        return numDemande.equals(that.numDemande) && codeEmp.equals(that.codeEmp) && codePiece.equals(that.codePiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numDemande, codeEmp, codePiece);
    }
}

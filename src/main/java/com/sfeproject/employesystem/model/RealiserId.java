package com.sfeproject.employesystem.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RealiserId implements Serializable {
    private Integer codeEmp;
    private Integer codeTache;
    private Integer codeBureau;

    public RealiserId() {}

    public RealiserId(Integer codeEmp, Integer codeTache, Integer codeBureau) {
        this.codeEmp = codeEmp;
        this.codeTache = codeTache;
        this.codeBureau = codeBureau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealiserId that = (RealiserId) o;
        return codeEmp.equals(that.codeEmp) && codeTache.equals(that.codeTache) && codeBureau.equals(that.codeBureau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeEmp, codeTache, codeBureau);
    }
}

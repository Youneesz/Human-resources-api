package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.DemandeConge;

import java.util.List;

public interface DemandeCongeService {

    public DemandeConge getDemangeConge(int id);
    public List<DemandeConge> getDemandesConge();
    public DemandeConge addDemandeConge(DemandeConge demandeConge);
    public DemandeConge updateDemandeConge(int id, DemandeConge demandeConge);
    public String deleteDemangeConge(int id);


}

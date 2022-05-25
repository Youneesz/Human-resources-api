package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.Actualite;

import java.util.List;

public interface ActualiteService {

    public Actualite getActualite(int idActualite);
    public List<Actualite> getActualites();
    public Actualite saveActualite(Actualite actualite);
    public Actualite updateActualite(int id, Actualite actualite);
    public String deleteActualite(int idActualite);

}

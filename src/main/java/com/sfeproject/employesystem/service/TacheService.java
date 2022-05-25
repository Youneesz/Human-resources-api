package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.Tache;

import java.util.List;

public interface TacheService {

    public Tache getTache(int idTache);
    public List<Tache> getAllTaches();
    public Tache addTache(Tache tache);
    public Tache updateTache(int id, Tache task);
    public String deleteTache(int idTask);
}

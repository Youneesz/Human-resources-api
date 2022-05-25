package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.Conge;

import java.util.List;

public interface CongeService {
    public Conge getConge(int id);
    public List<Conge> getConges();
    public Conge updateConge(int id, Conge conge);
    public Conge saveConge(Conge conge);
    public String deleteConge(int id);
}

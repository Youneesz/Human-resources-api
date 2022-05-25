package com.sfeproject.employesystem.service;


import com.sfeproject.employesystem.model.Tache;
import com.sfeproject.employesystem.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheServiceImpl implements TacheService {

    @Autowired
    private TacheRepository tacheRepository;

    @Override
    public Tache getTache(int idTache) {

        return tacheRepository.findById(idTache).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Tache> getAllTaches() {
        return tacheRepository.findAll();
    }

    @Override
    public Tache addTache(Tache tache) {
        for (Tache t : tacheRepository.findAll()) {
            if (t.getDescriptionTache().equals(tache.getDescriptionTache())
                    && t.getIntituleTache().equals(tache.getIntituleTache())) {
                return null;
            }
        }
        return tacheRepository.save(tache);
    }

    @Override
    public Tache updateTache(int id, Tache tache) {
        for (Tache t : tacheRepository.findAll()) {
            if (t.getDescriptionTache().equals(tache.getDescriptionTache())
                    && t.getIntituleTache().equals(tache.getIntituleTache())) {
                return null;
            }
        }
        Tache tempTache = getTache(id);
        tempTache.setIntituleTache(tache.getIntituleTache());
        tempTache.setDescriptionTache(tache.getDescriptionTache());
        return tacheRepository.save(tempTache);
    }

    @Override
    public String deleteTache(int idTache) {
        try {
            tacheRepository.deleteById(idTache);
            return "Tache supprimée avec succés !!";
        } catch (EmptyResultDataAccessException e) {
            return "Cet identifiant n'existe pas !!";
        }
    }
}

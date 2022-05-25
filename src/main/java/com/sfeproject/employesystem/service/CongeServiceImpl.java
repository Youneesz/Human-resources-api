package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.Conge;
import com.sfeproject.employesystem.repository.CongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongeServiceImpl implements CongeService{

    @Autowired
    private CongeRepository congeRepository;

    @Override
    public Conge getConge(int id) {
        return congeRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Conge> getConges() {
        return congeRepository.findAll();
    }

    @Override
    public Conge updateConge(int id, Conge conge) {
        for (Conge c : congeRepository.findAll()) {
            if (c.getDescriptionConge().equals(conge.getDescriptionConge())
                    && c.getIntituleConge().equals(conge.getIntituleConge())) {
                return null;
            }
        }
        Conge tempConge = congeRepository.findById(id).orElseThrow(RuntimeException::new);
        tempConge.setDescriptionConge(conge.getDescriptionConge());
        tempConge.setIntituleConge(conge.getIntituleConge());
        return congeRepository.save(tempConge);
    }

    @Override
    public Conge saveConge(Conge conge) {
        for (Conge c : congeRepository.findAll()) {
            if (c.getDescriptionConge().equals(conge.getDescriptionConge())
                    && c.getIntituleConge().equals(conge.getIntituleConge())) {
                return null;
            }
        }
        return congeRepository.save(conge);
    }


    @Override
    public String deleteConge(int id) {
        try{
            congeRepository.deleteById(id);
            return "Conge supprimé avec succes !!";
        }catch(EmptyResultDataAccessException e){
            return "Cet identifiant n'existe pas !!";
        }
    }
}

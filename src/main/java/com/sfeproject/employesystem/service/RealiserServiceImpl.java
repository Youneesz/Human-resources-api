package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.Realiser;
import com.sfeproject.employesystem.repository.BureauRepository;
import com.sfeproject.employesystem.repository.EmployeRepository;
import com.sfeproject.employesystem.repository.RealiserRepository;
import com.sfeproject.employesystem.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RealiserServiceImpl implements RealiserService{

    @Autowired
    private RealiserRepository realiserRepository;

    @Autowired
    private BureauRepository bureauRepository;

    @Autowired
    private EmployeRepository employeRepository;

    @Autowired
    private TacheRepository tacheRepository;

    @Override
    public Realiser getAffectation(int idAffectation) {
        return realiserRepository.findById(idAffectation).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Realiser> getAllAffectations() {
        return realiserRepository.findAll();
    }

    @Override
    public Realiser addAffectation(Realiser affectation) {
        for (Realiser a: realiserRepository.findAll()) {
            if (affectation.equals(a))
                return null;
        }
        affectation.setBureau(bureauRepository.findById(affectation.getBureau().getCodeBureau()).orElseThrow(RuntimeException::new));
        affectation.setTache(tacheRepository.findById(affectation.getTache().getCodeTache()).orElseThrow(RuntimeException::new));
        affectation.setEmployee(employeRepository.findById(affectation.getEmployee().getCodeEmp()).orElseThrow(RuntimeException::new));
        return realiserRepository.save(affectation);
    }

    @Override
    public Realiser updateAffectation(int id, Realiser affectation) {
        for (Realiser a: realiserRepository.findAll()) {
            if (affectation.equals(a))
                return null;
        }
        Realiser temp = getAffectation(id);
        temp.setBureau(affectation.getBureau());
        temp.setTache(affectation.getTache());
        temp.setEmployee(affectation.getEmployee());
        return realiserRepository.save(affectation);
    }

    @Override
    public String deleteAffectation(int idAffectation) {

        try{
            realiserRepository.deleteById(idAffectation);
            return "Afffectation supprimée avec succès !!";
        }catch(EmptyResultDataAccessException e){
            return "Cet identifiant n'existe pas !!";
        }

    }
}

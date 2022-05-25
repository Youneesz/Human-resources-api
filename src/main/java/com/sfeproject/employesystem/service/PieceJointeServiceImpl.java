package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.PieceJointe;
import com.sfeproject.employesystem.repository.ActualiteRepository;
import com.sfeproject.employesystem.repository.PieceJointeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PieceJointeServiceImpl implements PieceJointeService {

    @Autowired
    private PieceJointeRepository pieceJointeRepository;

    @Autowired
    private ActualiteRepository actualiteRepository;


    @Override
    public List<PieceJointe> getPiecesJointes() {
        return pieceJointeRepository.findAll();
    }

    @Override
    public List<PieceJointe> getPiecesByActualite(int idActualite) {
        List<PieceJointe> pieceJointes = new ArrayList<>();
        for (PieceJointe p : pieceJointeRepository.findAll()) {
            if (p.getActualite().getCodeActualite() == idActualite) {
                pieceJointes.add(p);
            }
        }
        return pieceJointes;
    }

    @Override
    public PieceJointe addPieceJointe(PieceJointe pieceJointe) {
        for (PieceJointe p : pieceJointeRepository.findAll()) {
            if (p.getCheminPieceJ().equals(pieceJointe.getCheminPieceJ())) {
                return null;
            }
        }
        pieceJointe.setActualite(actualiteRepository.findById(pieceJointe.getActualite().getCodeActualite()).orElseThrow(RuntimeException::new));
        return pieceJointeRepository.save(pieceJointe);
    }

    @Override
    public PieceJointe getPieceJointe(int id) {
        return pieceJointeRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<PieceJointe> getPieceJointes() {
        return pieceJointeRepository.findAll();
    }

    @Override
    public String deletePieceJointe(int id) {
        try {
            actualiteRepository.deleteById(id);
            return "piece jointe supprimée avec succes !!";
        } catch (EmptyResultDataAccessException e) {
            return "Cet identifiant n'existe pas !!";
        }
    }

    @Override
    public PieceJointe updatePieceJointe(int id, PieceJointe pieceJointe) {
        for (PieceJointe p : pieceJointeRepository.findAll()) {
            if (p.getCheminPieceJ().equals(pieceJointe.getCheminPieceJ())) {
                return null;
            }
        }
        PieceJointe temp = getPieceJointe(id);
        temp.setCheminPieceJ(pieceJointe.getCheminPieceJ());
        temp.setActualite(pieceJointe.getActualite());
        return pieceJointeRepository.save(temp);
    }
}

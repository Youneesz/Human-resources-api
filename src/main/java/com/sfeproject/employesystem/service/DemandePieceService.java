package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.DemandePiece;

import java.util.List;

public interface DemandePieceService {

    public DemandePiece getDemangePiece(int id);
    public List<DemandePiece> getDemandesPiece();
    public DemandePiece addDemandePiece(DemandePiece demandePiece);
    public DemandePiece updateDemandePiece(int id, DemandePiece demandePiece);
    public String deleteDemangePiece(int id);
}


package com.sfeproject.employesystem.service;

import com.sfeproject.employesystem.model.Piece;

import java.util.List;

public interface PieceService {

    public Piece getPiece(int id);
    public List<Piece> getPieces();
    public Piece updatePiece(int id, Piece piece);
    public Piece savePiece(Piece piece);
    public String deletePiece(int id);
}

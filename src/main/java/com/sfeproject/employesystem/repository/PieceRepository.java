package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.Piece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PieceRepository extends JpaRepository<Piece, Integer>, JpaSpecificationExecutor<Piece> {

}
package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.DemandePiece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DemandePieceRepository extends JpaRepository<DemandePiece, Integer>, JpaSpecificationExecutor<DemandePiece> {

}
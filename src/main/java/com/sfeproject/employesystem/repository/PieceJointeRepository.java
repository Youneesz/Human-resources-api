package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.PieceJointe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PieceJointeRepository extends JpaRepository<PieceJointe, Integer>, JpaSpecificationExecutor<PieceJointe> {

}
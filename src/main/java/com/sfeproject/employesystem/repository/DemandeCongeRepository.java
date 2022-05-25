package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.DemandeConge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface DemandeCongeRepository extends JpaRepository<DemandeConge, Integer>, JpaSpecificationExecutor<DemandeConge> {




}
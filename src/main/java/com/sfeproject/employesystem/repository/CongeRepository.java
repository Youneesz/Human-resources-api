package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.Conge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CongeRepository extends JpaRepository<Conge, Integer>, JpaSpecificationExecutor<Conge> {

}
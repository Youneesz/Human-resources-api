package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.Actualite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ActualiteRepository extends JpaRepository<Actualite, Integer>, JpaSpecificationExecutor<Actualite> {

}
package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TacheRepository extends JpaRepository<Tache, Integer>, JpaSpecificationExecutor<Tache> {

}
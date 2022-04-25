package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.Realiser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RealiserRepository extends JpaRepository<Realiser, Integer>, JpaSpecificationExecutor<Realiser> {

}
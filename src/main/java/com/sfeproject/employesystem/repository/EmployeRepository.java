package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeRepository extends JpaRepository<Employe, Integer>, JpaSpecificationExecutor<Employe> {

}
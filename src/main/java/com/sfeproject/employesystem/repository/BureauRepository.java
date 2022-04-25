package com.sfeproject.employesystem.repository;

import com.sfeproject.employesystem.model.Bureau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BureauRepository extends JpaRepository<Bureau, Integer>, JpaSpecificationExecutor<Bureau> {

}
package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.utilities.entity.LookupTypeEntity;

public interface LookupTypeRepository extends JpaRepository<LookupTypeEntity, Long> {

}

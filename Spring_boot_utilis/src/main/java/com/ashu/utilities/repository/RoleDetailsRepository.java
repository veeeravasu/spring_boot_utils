package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.RoleDetailsEntity;
@Repository
public interface RoleDetailsRepository extends JpaRepository<RoleDetailsEntity, Long> {

}

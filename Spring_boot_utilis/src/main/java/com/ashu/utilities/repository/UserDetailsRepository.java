package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.UserDetailsEntity;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity, Long> {

}

package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.LoginHistoryEntity;
@Repository
public interface LoginHistoryRepository extends JpaRepository<LoginHistoryEntity, Long> {

}

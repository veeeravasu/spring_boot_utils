package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.EmployeeHistory;

@Repository
public interface EmployeeHistoryRepository extends JpaRepository<EmployeeHistory, Long> {

}

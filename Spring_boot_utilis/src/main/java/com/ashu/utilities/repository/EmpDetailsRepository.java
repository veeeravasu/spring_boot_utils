package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.EmployeeDetails;

@Repository
public interface EmpDetailsRepository extends JpaRepository<EmployeeDetails, Long> {

}

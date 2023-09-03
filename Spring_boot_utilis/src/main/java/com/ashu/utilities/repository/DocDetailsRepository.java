package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.DocDetails;

@Repository
public interface DocDetailsRepository extends JpaRepository<DocDetails, Long> {

}

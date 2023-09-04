package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.TechnologyDetails;

@Repository
public interface TechnologyDetailsRepository extends JpaRepository<TechnologyDetails, Long> {

}

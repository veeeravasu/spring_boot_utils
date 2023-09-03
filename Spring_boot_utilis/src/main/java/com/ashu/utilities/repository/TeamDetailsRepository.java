package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.TeamDetails;

@Repository
public interface TeamDetailsRepository extends JpaRepository<TeamDetails, Long> {

}
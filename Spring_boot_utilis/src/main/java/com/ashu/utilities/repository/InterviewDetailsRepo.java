package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.InterviewDetails;

/*
 * @author jyothi.ch
 */

@Repository
public interface InterviewDetailsRepo extends JpaRepository<InterviewDetails, Long> {

}

package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.LeaveRequestDetails;

/*
 * @author jyothi.ch
 */

@Repository
public interface LeaveRequestDetailsRepo extends JpaRepository<LeaveRequestDetails, Long> {

}

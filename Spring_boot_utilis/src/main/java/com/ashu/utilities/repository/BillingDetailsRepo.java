package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.BillingDetails;

/*
 * @author jyothi.ch
 */
@Repository
public interface BillingDetailsRepo extends JpaRepository<BillingDetails, Long> {

}

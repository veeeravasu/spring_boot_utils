package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.EmpRating;

/*
 * @author jyothi.ch
 */
@Repository
public interface EmpRatingRepo extends JpaRepository<EmpRating, Long> {

}

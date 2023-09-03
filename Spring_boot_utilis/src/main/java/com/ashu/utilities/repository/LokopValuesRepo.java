/**
 * 
 */
package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.LokopValues;

/**
 * @author jyothi.ch
 *
 */
@Repository
public interface LokopValuesRepo extends JpaRepository<LokopValues, Long> {

}

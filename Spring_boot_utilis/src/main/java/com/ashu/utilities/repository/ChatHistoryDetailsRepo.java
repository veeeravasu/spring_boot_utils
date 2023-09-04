/**
 * 
 */
package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.ChatHistoryDetails;

/**
 * @author Jyothi Ch
 *
 */
@Repository
public interface ChatHistoryDetailsRepo extends JpaRepository<ChatHistoryDetails, Long> {

}

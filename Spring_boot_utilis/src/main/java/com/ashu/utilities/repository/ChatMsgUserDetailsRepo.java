/**
 * 
 */
package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.ChatMsgUserDetails;

/**
 * @author jyothi.ch
 *
 */
@Repository
public interface ChatMsgUserDetailsRepo extends JpaRepository<ChatMsgUserDetails, Long> {

}

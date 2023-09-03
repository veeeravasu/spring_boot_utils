package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.utilities.entity.BugDetailsEntity;

public interface BugDetailsRepository extends JpaRepository<BugDetailsEntity, Long> {

}

package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.TaskDetailsEntity;

@Repository
public interface TaskDetailsRepository extends JpaRepository<TaskDetailsEntity, Long> {

}

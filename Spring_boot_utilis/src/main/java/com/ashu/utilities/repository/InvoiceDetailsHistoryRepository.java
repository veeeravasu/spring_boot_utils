package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashu.utilities.entity.InvoiceDetailsHistory;

@Repository
public interface InvoiceDetailsHistoryRepository extends JpaRepository<InvoiceDetailsHistory, Long> {

}

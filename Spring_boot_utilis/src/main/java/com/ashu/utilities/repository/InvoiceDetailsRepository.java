package com.ashu.utilities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashu.utilities.entity.InvoiceDetails;

public interface InvoiceDetailsRepository extends JpaRepository<InvoiceDetails, Long> {

}

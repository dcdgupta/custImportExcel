package com.ftl.custImportExcel.repository;

import com.ftl.custImportExcel.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

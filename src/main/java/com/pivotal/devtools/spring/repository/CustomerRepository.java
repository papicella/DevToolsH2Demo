package com.pivotal.devtools.spring.repository;

import com.pivotal.devtools.spring.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Long> {
}

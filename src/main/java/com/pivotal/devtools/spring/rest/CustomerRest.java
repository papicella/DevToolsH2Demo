package com.pivotal.devtools.spring.rest;

import com.pivotal.devtools.spring.domain.Customer;
import com.pivotal.devtools.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRest
{
    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/allcustomers")
    public List<Customer> allCustomers()
    {
        return customerRepository.findAll();
    }
}

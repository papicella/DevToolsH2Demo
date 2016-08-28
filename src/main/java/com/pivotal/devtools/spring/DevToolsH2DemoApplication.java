package com.pivotal.devtools.spring;

import com.pivotal.devtools.spring.domain.Customer;
import com.pivotal.devtools.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DevToolsH2DemoApplication {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(DevToolsH2DemoApplication.class, args);
	}

	@PostConstruct
	public void init()
	{
		customerRepository.save(new Customer("NAB"));
		customerRepository.save(new Customer("WESTPAC"));
		customerRepository.save(new Customer("CBA"));
		customerRepository.save(new Customer("ANZ"));
	}
}

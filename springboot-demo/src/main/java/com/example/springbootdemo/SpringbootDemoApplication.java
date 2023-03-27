package com.example.springbootdemo;

import com.example.springbootdemo.model.Employee;
import com.example.springbootdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);

	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee= new Employee();
		employee.setFirstName("Priya");
		employee.setLastName("Sharma");
		employee.setEmail("priya123@gmail.com");
		employeeRepository.save(employee);


		Employee employee1= new Employee();
		employee1.setFirstName("Rakesh");
		employee1.setLastName("Gupta");
		employee1.setEmail("rakesh123@gmail.com");
		employeeRepository.save(employee1);


		Employee employee2= new Employee();
		employee2.setFirstName("Anchal");
		employee2.setLastName("jain");
		employee2.setEmail("anchal123@gmail.com");
		employeeRepository.save(employee2);
	}

}


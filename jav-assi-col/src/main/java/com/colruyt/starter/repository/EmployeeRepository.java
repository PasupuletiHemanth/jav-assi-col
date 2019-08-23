package com.colruyt.starter.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colruyt.starter.model.Employee;
import com.colruyt.starter.repository.custom.EmployeeRepositoryCustom;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>, EmployeeRepositoryCustom{
	
	public List<Employee> findAll();
	//public Optional<Employee> findById(Long id);
	

}

package com.colruyt.starter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colruyt.starter.model.Department;
import com.colruyt.starter.model.Employee;
import com.colruyt.starter.repository.custom.EmployeeRepositoryCustom;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	public List<Department> findAll();
	

}

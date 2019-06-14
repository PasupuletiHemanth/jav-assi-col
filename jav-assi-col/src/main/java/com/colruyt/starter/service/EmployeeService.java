package com.colruyt.starter.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colruyt.starter.model.Cheif;
import com.colruyt.starter.model.Department;
import com.colruyt.starter.model.Employee;
import com.colruyt.starter.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee()
	{
		return employeeRepository.findAll();
	}

	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		return employee;
	}

	public Employee getMaxSalEmp() {
		// TODO Auto-generated method stub
		return employeeRepository.getMaxSalEmp();
	}
	
	public List<Employee> getMaxSalEmpByDept(String deptName) {
		// TODO Auto-generated method stub
		return employeeRepository.getMaxSalEmpByDept(deptName);
	}

	public List<Employee> getEmpByDepart(String deptName) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmpByDepartMent(deptName);
	}

	public Map<String, Double> getMaxSalInAllEmp() {
		// TODO Auto-generated method stub
		return employeeRepository.getMaxSalInAllEmp();
	}

	public Cheif getCheifByEmp(Long empId) {
		// TODO Auto-generated method stub
		//Employee e=employeeRepository.findEmployeeById(empId);
		Employee e=employeeRepository.findById(empId).get();
		return e.getCheif();
	}

}

package com.colruyt.starter.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.colruyt.starter.model.Cheif;
import com.colruyt.starter.model.Employee;
import com.colruyt.starter.service.EmployeeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping("/maxSalInAllEmp")
	public Map<String, Double> getMaxSalInAllEmp() {
		/*
		 * Employee e=new Employee(); e.setName("TestName"); Map m=new HashMap();
		 * m.put("maxSal", "100"); m.put("maxSalEmp", e ); return m;
		 */
		return employeeService.getMaxSalInAllEmp();
	}

	@GetMapping("/maxSalEmp")
	public Employee getMaxSalEmp() {
		System.out.println("In getMaxSalEmp()");
		return employeeService.getMaxSalEmp();
	}

	@GetMapping("/cheifByEmp/{empId}")
	public Cheif getCheifByEmp(@PathVariable Long empId) {
		System.out.println("In getCheifByEmp()");
		return employeeService.getCheifByEmp(empId);
	}

	@GetMapping("/maxSalEmpByDept/{deptName}")
	public List<Employee> maxSalEmpByDept(@PathVariable String deptName) {
		System.out.println("In maxSalEmpByDept");
		return employeeService.getMaxSalEmpByDept(deptName);
	}

	@GetMapping("/empByDepart/{deptName}")
	public List<Employee> getEmpByDepart(@PathVariable String deptName) {
		System.out.println("In getEmpByDepart()");
		return employeeService.getEmpByDepart(deptName);
	}

	@PostMapping("/addEmp")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PutMapping("/updateEmp/{empId}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int empId) {
		System.out.println("in update emp");
		employee.setId(empId);
		return employeeService.addEmployee(employee);
	}
}

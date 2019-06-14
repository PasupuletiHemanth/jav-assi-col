package com.colruyt.starter.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.colruyt.starter.model.Department;
import com.colruyt.starter.service.DepartmentService;
import com.colruyt.starter.service.EmployeeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;

	@PostMapping("/addDept")
    public Department createDepartment(@RequestBody Department department) {
		System.out.println("in cre dept"+department.getDepName());
        return departmentService.addDepartment(department);
    }
}

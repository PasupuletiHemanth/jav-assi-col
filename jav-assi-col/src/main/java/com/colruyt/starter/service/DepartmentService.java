package com.colruyt.starter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colruyt.starter.model.Department;
import com.colruyt.starter.repository.DepartmentRepository;
import com.colruyt.starter.repository.EmployeeRepository;
import com.colruyt.util.CommonUtil;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	CommonUtil commonUtil;
	
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	
	public int testAddUtil(int a, int b)
	{
		return commonUtil.add(a, b);
	}

}

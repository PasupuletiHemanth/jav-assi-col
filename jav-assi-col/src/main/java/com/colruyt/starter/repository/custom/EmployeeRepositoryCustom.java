package com.colruyt.starter.repository.custom;

import java.util.List;
import java.util.Map;

import com.colruyt.starter.model.Cheif;
import com.colruyt.starter.model.Employee;

public interface EmployeeRepositoryCustom {
	
	public Employee getMaxSalEmp();
	
	public List<Employee> getEmpByDepartMent(String deptName);
  
	public List<Employee> getMaxSalEmpByDept(String deptName);
	
	public Map<String,Double> getMaxSalInAllEmp();
	public Employee findEmployeeById(Long id);

}

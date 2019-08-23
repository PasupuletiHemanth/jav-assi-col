package com.colruyt.starter.repository.custom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;

import com.colruyt.starter.model.Cheif;
import com.colruyt.starter.model.Department;
import com.colruyt.starter.model.Employee;

public class EmployeeRepositoryCustomImpl implements EmployeeRepositoryCustom {

	
	@PersistenceContext
    private EntityManager em;
	
	@Override
	public Employee getMaxSalEmp() {
		
		Session session=em.unwrap(Session.class);
		System.out.println(session);
		Transaction transaction=session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<Double> criteriaQuery = builder.createQuery(Double.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(builder.max(root.get("salary")));
        Query<Double> query = session.createQuery(criteriaQuery);
        Double maxSalary = query.getSingleResult();
        System.out.println("Max Salary = " + maxSalary);
        
        Query<Employee> query1 = session.createQuery("from Employee where salary=:salary");
        query1.setParameter("salary", maxSalary);
        Employee emp=query1.getSingleResult();
        transaction.commit();
        
		return emp;
	}
	
	@Override
	public List<Employee> getEmpByDepartMent(String deptName) {
		
		Session session=em.unwrap(Session.class);
		System.out.println(session);
		Transaction transaction=session.beginTransaction();
        
        Query<Department> query1 = session.createQuery("from Department where depName=:depName");
        query1.setParameter("depName", deptName);
        Department department=query1.getSingleResult();
        
        Query<Employee> query2 = session.createQuery("from Employee where deptId=:deptId");
        query2.setParameter("deptId", department.getId());
        List<Employee> empLst=query2.list();
        
        transaction.commit();
        
		return empLst;
	}
	
	
	public List<Employee> getMaxSalEmpByDept(String deptName)
	{
		Session session=em.unwrap(Session.class);
		System.out.println(session);
		Transaction transaction=session.beginTransaction();
		Query<Double> query1 = session.createQuery("select max(e.salary) from Employee e, Department d where e.deptId=d.id and d.depName=:depName");
        query1.setParameter("depName", deptName);
        Double maxSal=query1.getSingleResult();
        
        
        Query<Employee> query2 = session.createQuery("select e from Employee e, Department d where e.deptId=d.id and d.depName=:depName and e.salary=:sal");
        query2.setParameter("depName", deptName);
        query2.setParameter("sal", maxSal);
        List<Employee> empLst=query2.list();
        transaction.commit();
        return empLst;
	}
	
	public Map<String,Double> getMaxSalInAllEmp(){
		
		Session session=em.unwrap(Session.class);
		System.out.println(session);
		Transaction transaction=session.beginTransaction();
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		CriteriaQuery<Double> criteriaQuery = builder.createQuery(Double.class);
        Root<Employee> root = criteriaQuery.from(Employee.class);
        criteriaQuery.select(builder.max(root.get("salary")));
        Query<Double> query = session.createQuery(criteriaQuery);
        Double maxSalary = query.getSingleResult();
        System.out.println("Max Salary = " + maxSalary);
        
        Map<String,Double> mspMaxSal=new HashMap<>();
        
        mspMaxSal.put("maxSalInAllEmployee", maxSalary);
        transaction.commit();
		return mspMaxSal;
	}
	
	public Employee findEmployeeById(Long empId)
	{
		Session session=em.unwrap(Session.class);
		System.out.println(session);
		Transaction transaction=session.beginTransaction();
		 Query<Employee> query2 = session.createQuery("from Employee where id=:empId");
		 query2.setParameter("empId", empId);
		 Employee emp=query2.getSingleResult();
		 transaction.commit();
		 return emp;
	}

}

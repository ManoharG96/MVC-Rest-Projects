package com.dxctechnology.resoureces;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dxctechnology.model.Employee;

@Path("employee")
public class EmployeeResources {

	@GET
	@Produces (MediaType.APPLICATION_JSON)
	public List<Employee> display() {
		
		Employee emp = new Employee();
		emp.setEmpId(123);
		emp.setEmpName("Munna");
		emp.setEmpSalary(246540.00);
		
		Employee emp1 = new Employee();
		emp1.setEmpId(234);
		emp1.setEmpName("Reddy");
		emp1.setEmpSalary(23453.00);
		
		List<Employee> listEmployees = new ArrayList<Employee>();
		listEmployees.add(emp);
		listEmployees.add(emp1);
		
		return listEmployees;
	}

}

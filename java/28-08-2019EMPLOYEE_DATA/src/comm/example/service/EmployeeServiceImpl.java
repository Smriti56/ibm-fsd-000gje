package comm.example.service;

import comm.example.dao.*;
import java.sql.SQLException;
import java.util.List;

import comm.example.model.Employee;
import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao dao = null;
	

	public EmployeeServiceImpl(EmployeeDao dao) throws SQLException {
		super();
		dao = new EmployeeDaoImpl();
	}

	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createEmployee(Employee employee) {
		dao.createEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public void deleteEmployeeById(int id) {
		dao.deleteEmployeeById(id);
	}

	

	

}

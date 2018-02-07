package dao;

import java.util.List;
import model.Employee;
//CRUD operations
public interface EmployeeDAO {
	
	//Create
	public void save(model.Employee employee);
	//Read
	public model.Employee getById(int id);
	//Update
	public void update(model.Employee employee);
	//Delete
	public void deleteById(int id);
	//Get All
	public List<model.Employee> getAll();
}

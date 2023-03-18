package java8features;

public class Employee {

	

public Employee(String id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
	}
private String id; 	
private String name;
private String Department;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Department=" + Department + "]";
}
	
}

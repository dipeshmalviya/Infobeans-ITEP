package model;

public class Employee {
	private int id;
	private String name;
	private String email;
	private int salary;
	private String department;

	public Employee() {
	}

	public Employee(String name,String email, int salary, String department) {
		super();
		this.name = name;
		this.setEmail(email);
		this.salary = salary;
		this.setDepartment(department);
	}

	public Employee(int id, String name,String email, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}

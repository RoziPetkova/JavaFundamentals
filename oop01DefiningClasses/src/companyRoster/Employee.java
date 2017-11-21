package companyRoster;

public class Employee {

	Employee(String name, Double salary, String position, String department) {
		setName(name);
		setSalary(salary);
		setPosition(position);
		setDepartment(department);
		setEmail(null);
		this.setAge(null);
	}

	Employee(String name, Double salary, String position, String department, String email, Integer age) {
		this(name, salary, position, department);
		this.setEmail(email);
		this.setAge(age);
	}
	
	Employee(String name, Double salary, String position, String department, String unknown) {
		this(name, salary, position, department);
		try {	
			this.setAge(Integer.valueOf(unknown));
		} catch (NumberFormatException e) {
			this.setEmail(unknown);
		}
	}
	

	String name;
	Double salary;
	String position;
	String department;
	String email;
	int age;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Double getSalary() {
		return salary;
	}

	void setSalary(Double salary) {
		this.salary = salary;
	}

	String getPosition() {
		return position;
	}

	void setPosition(String position) {
		this.position = position;
	}

	String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email == null ? "n/a" : email;
	}

	int getAge() {
		return age;
	}

	void setAge(Integer age) {
		this.age = age == null ? -1 : age;
	}
}
package firstAndReservedTeam;

public class Person {
	private String firstName;
	private String lastnNane;
	private Integer age;
	private double salary;

	public Person(String str1, String str2, int age) {
		setFirstName(str1);
		setLastName(str2);
		setAge(age);
	}

	public Person(String str1, String str2, int age, double salary) {
		this(str1, str2, age);
		setSalary(salary);
	}

	private void setFirstName(String str) {
		if (str.length() < 3)
			throw new IllegalArgumentException("First name cannot be less than 3 symbols");
		this.firstName = str;
	}

	private void setLastName(String str) {
		if (str.length() < 3)
			throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
		this.lastnNane = str;
	}

	private void setAge(Integer age) {
		if (age < 1)
			throw new IllegalArgumentException("Age cannot be zero or negative integer");
		this.age = age;
	}

	private void setSalary(Double salary) {
		if (salary < 460)
			throw new IllegalArgumentException("Salary cannot be less than 460 leva");
		this.salary = salary;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastnNane;
	}

	public Integer getAge() {
		return this.age;
	}

	public double getSalary() {
		return this.salary;
	}

	public void increaseSalary(int percent) {
		if (this.age > 30) 
			this.salary += this.salary * percent / 100;
		else 
			this.salary += this.salary * percent / 200;

	}

	@Override
	public String toString() {
		return String.format("%s %s gets %s leva", this.getFirstName(), this.lastnNane, this.salary);
	}
}

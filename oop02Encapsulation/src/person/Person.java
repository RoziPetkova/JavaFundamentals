package person;

class Person {
	private String firstName;
	private String lastnNane;
	private Integer age;
	private double salary;

	public Person(String str1, String str2, int age) {
		this.firstName = str1;
		this.lastnNane = str2;
		this.age = age;
	}

	public Person(String str1, String str2, int age, double salary) {
		this(str1, str2, age);
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

	public void IncreaseSalary(int percent) {
		if (this.getAge() <= 30)
			this.salary += salary * (percent / 2) / 100;
		else
			this.salary += salary * percent / 100;
	}

	@Override
	public String toString() {
		return String.format("%s %s gets %s leva", this.getFirstName(), this.lastnNane, this.getSalary());
	}
}

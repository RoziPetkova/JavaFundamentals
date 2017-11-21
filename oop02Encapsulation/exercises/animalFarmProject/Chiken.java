package animalFarmProject;

public class Chiken {
	private String name;
	private Integer age;
	
	
	public Chiken(String name, Integer age) {
		setAge(age);
		setName(name);
	}
	
	//Set name and age
	private void setName(String name){
		if(name.trim().length() < 1)
			throw new IllegalArgumentException("Name cannot be empty.");
		this.name = name;
	}
	private void setAge(Integer age){
		if(age < 0 || age > 15)
			throw new IllegalArgumentException("Age should be between 0 and 15.");
		this.age = age;
	}
	
	//Get name and age
	public String getName() {
		return this.name;
	}
	public Integer getAge() {
		return this.age;
	}

	
	//Get production per day
	public Double productPerDay(){
		return this.calculateProductPerDay();
	}

	private Double calculateProductPerDay() {
		return this.age < 6 ? 2 : this.age >= 12 ? 0.75 : 1;
	}
}

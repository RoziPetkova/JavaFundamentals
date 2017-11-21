package p06Animals;

public class Animal {

	private String name;
	private Integer age;
	private String gender;

	Animal(String name, String age, String gender) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	private void setAge(String age) {
		try {
			if (Integer.valueOf(age) < 0)
				throw new IllegalArgumentException("Invalid input!");
			this.age = Integer.valueOf(age);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid input!");
		}

	}
	
	public String getGender() {
		return gender;
	}

	void setGender(String gender) {
		if(!("Male".equals(gender)) && !("Female".equals(gender)))
			throw new IllegalArgumentException("Invalid input!");
		this.gender = gender;
	}

	String produceSound() {
		return "Not implemented";
	}
	
	@Override
	public String toString(){
		return  String.format("%s\n%s %s %s\n%s", 
								this.getClass().getSimpleName(), 
								this.getName(), 
								this.getAge(), 
								this.getGender(), 
								this.produceSound());
	}
	
}

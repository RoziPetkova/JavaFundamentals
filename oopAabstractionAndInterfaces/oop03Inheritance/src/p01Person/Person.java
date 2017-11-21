package p01Person;

public class Person {
	
	String name; 
	Integer age;
	
	protected Person(String name, Integer age) {
		this.setAge(age);
		this.setName(name);
	}
	
	public String getName() {
	    return this.name;
	}

	void setName(String name) {
		if( name.length() < 3)
			throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
		this.name = name;
	}

	Integer getAge() {
	    return this.age;
	}

	protected void setAge(Integer age) {
	    if(age < 1)
	    	throw new IllegalArgumentException("Age must be positive!")	;
	    this.age = age;
	 }

	 @Override
	 public String toString(){
		 final StringBuilder sb = new StringBuilder();
		    sb.append(String.format("Name: %s, Age: %d",
		                    this.getName(),
		                    this.getAge()));

		    return sb.toString();

	 }
}

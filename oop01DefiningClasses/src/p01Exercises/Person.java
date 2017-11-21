package p01Exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Person {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Person> people = new ArrayList<Person>();
		
		int count = Integer.valueOf(reader.readLine());
		while (count > 0) {
			String[] line = reader.readLine().split("\\s+");
			people.add(new Person(line[0], Integer.valueOf(line[1])));
			count --;
		}
		
		people.stream().filter(x -> x.age > 30).sorted((x,y) -> x.name.compareTo(y.name)).forEach(x ->{
			System.out.println(x.name + " - " + x.age);
		});
	   
	}

	private String name;
	private Integer age;

	public Person() {
		this.setName("No name");
		this.setAge(1);
	}

	public Person(int age) {
		setName("No name");
		this.setAge(age);
	}

	public Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	// NAME
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
	// AGE
	Integer getAge() {
		return age;
	}

	void setAge(Integer age) {
		this.age = age;
	}

}

package exercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10GroupByGroup {
	public static void main(String[] args) {

		List<Student> lines = new ArrayList<>();
		try (Scanner scan = new Scanner(System.in)) {
			String line = scan.nextLine();
			while (!line.equals("END")) {

				lines.add(new Student(line.split("[\\s]+")[0] + " " + line.split("[\\s]+")[1], Integer.parseInt(line.split("[\\s]+")[2])));

				line = scan.nextLine();
			}
			
		}
		Map<Integer, List<String>> studentsMap = new LinkedHashMap<>();
		studentsMap = lines.stream().collect(Collectors.groupingBy(Student::getGroup, Collectors.mapping(Student::getName, Collectors.toList())));
		
		studentsMap.entrySet().forEach(a -> System.out.println(a.getKey()+" - "+String.join(", ",a.getValue())));
	}

	public static class Student {
		public String name;
		public  Integer group;
		
		public String getName(){
			return this.name;
		}
		
		public Integer getGroup(){
			return this.group;
		}

		public Student(String name, int group) {
			this.name = name;
			this.group = group;
		}
	}
}
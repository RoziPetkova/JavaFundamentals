package p03ManKind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = reader.readLine().split("\\s+");
		Student student; 
		Worker worker;
		try {
			student = new Student(line[0], line[1], line[2]);
			line = reader.readLine().split("\\s+");
			worker = new Worker(line[0], line[1], line[2], line[3]);
			System.out.println("First Name: " + student.getfName());
			System.out.println("Last Name: " + student.getlName());
			System.out.println("Faculty number: " + student.getFacNumber());
			System.out.println("First Name: " + worker.getfName());
			System.out.println("Last Name: " +  worker.getlName());
			System.out.printf("Week Salary: %.2f\n", worker.getWeekSalary());
			System.out.printf("Hours per day: %.2f\n", worker.getworkingHours());
			System.out.printf("Salary per hour: %.2f\n", worker.getSalaryPerHour());
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

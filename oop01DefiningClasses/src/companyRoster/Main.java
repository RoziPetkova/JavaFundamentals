package companyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.valueOf(reader.readLine());
		Map<String, Department> departments = new HashMap<String, Department>();
		String[] line = new String[6];

		while (count > 0) {
			line = reader.readLine().split("\\s+");
			// Toshko 609.99 Manager Sales toshko@abv.bg 44
			departments.putIfAbsent(line[3], new Department(line[3]));

			if (line.length == 6) {
				departments.get(line[3]).employees
						.add(new Employee(line[0], Double.parseDouble(line[1]), line[2], line[3], line[4], Integer.parseInt(line[5])));
			}

			if (line.length == 5) {
				departments.get(line[3]).employees.add(new Employee(line[0], Double.parseDouble(line[1]), line[2], line[3], line[4]));
			}

			if (line.length == 4) {
				departments.get(line[3]).employees.add(new Employee(line[0], Double.parseDouble(line[1]), line[2], line[3]));
			}

			count--;
		}

		Comparator<Department> comparator = (dep1, dep2) -> 
					dep1.employees.stream().mapToDouble(emp -> emp.salary).average().getAsDouble() == 
					dep2.employees.stream().mapToDouble(emp -> emp.salary).average().getAsDouble() ? 0 : 
						dep1.employees.stream().mapToDouble(emp -> emp.salary).average().getAsDouble() > 
						dep2.employees.stream().mapToDouble(emp -> emp.salary).average().getAsDouble() ? -1 : 1; // handle
																															// the
																															// -1
																															// case
																															// too
																															// ?!
																															// FIXME

		departments.values().stream().sorted(comparator).limit(1).forEach(x -> {
			System.out.printf("Highest Average Salary: %s\n", x.name);
			x.employees.forEach(emp -> System.out.print(emp.name + " " + emp.salary + " " + emp.email + " " + emp.age + "\n"));
		});
	}
}

package companyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	String name;
	List<Employee> employees = new ArrayList<Employee>();
	
	
	Department(String name) {
		this.name = name;
	}
}

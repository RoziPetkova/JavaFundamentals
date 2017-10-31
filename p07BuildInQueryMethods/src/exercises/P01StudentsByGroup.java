package exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P01StudentsByGroup {
	public static Comparator<String> compFirstName = Comparator.comparing(x -> x.split("s")[0]);
public static void main(String[] args) {
	List<String> lines = new ArrayList<String>();
	try(Scanner scan = new Scanner(System.in))
	{
		String line = scan.nextLine();
		while (!line.equals("end")) {
			lines.add(line);
			
			line = scan.nextLine();
		}
	}
	
	lines.stream()
				.filter(str -> str.charAt(str.length()- 1)== '2')
				.sorted(compFirstName)
				.forEach(x -> System.out.printf("%s\n", x.substring(0, x.length() - 2)));
}
}

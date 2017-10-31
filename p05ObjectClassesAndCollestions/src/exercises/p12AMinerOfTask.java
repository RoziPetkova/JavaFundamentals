package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p12AMinerOfTask {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Map<String, Integer> resources = new HashMap<>();

			String line = scan.nextLine();
			while (!line.equals("stop")) {
				if (resources.containsKey(line))
					resources.put(line, Integer.parseInt(scan.nextLine()) + resources.get(line));
				else
					resources.put(line, Integer.parseInt(scan.nextLine()) + 0);
				line = scan.nextLine();
			}
			
			resources.keySet().forEach( x-> System.out.printf("%s -> %d\n", x, resources.get(x)));
		}
	}
}

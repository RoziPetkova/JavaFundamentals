package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class P12ThePartyReservationDilterModule {
	public static void main(String[] args) {
		List<String> names;
		Map<String, Predicate<String>> functions = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		names = new ArrayList<String>(Arrays.asList(scan.nextLine().split("\\s+")));
		String[] line = scan.nextLine().split(";");
		while (!line[0].equals("Print")) {
			String command = line[0];
			String filter = line[1];
			String param = line[2];
			addOrRemoveF(functions, command, filter, param);
			line = scan.nextLine().split(";");
		}
		
		List<String> toRemove = new ArrayList<String>();
		for (Predicate<String> func : functions.values()) {
			for (String name : names) {
				if (func.test(name))
					toRemove.add(name);
			} 
		}

		names.removeAll(toRemove);
		names.forEach(x -> System.out.print(x +" "));
	}

	public static void addOrRemoveF(Map<String, Predicate<String>> functions, String command, String filter, String param) {
		if (command.equals("Add filter"))
			functions.put(filter + param, createPredicate(filter, param));
		else
			functions.remove(filter+param);
	}

	private static Predicate<String> createPredicate(String filter, String param) {
		Predicate<String> startsWith = x -> x.startsWith(param);
		Predicate<String> endsWith = x -> x.endsWith(param);
		Predicate<String> containStr = x -> x.contains(param);
		Predicate<String> lenghtStr = x -> x.length() == Integer.parseInt(param);

		return filter.equals("Starts with") ? startsWith 
				: filter.equals("Ends with") ? endsWith 
						: filter.equals("Length") ? lenghtStr 
								: containStr;
	}
}

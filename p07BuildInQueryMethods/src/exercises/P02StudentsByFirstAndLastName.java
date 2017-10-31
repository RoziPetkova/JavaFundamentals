package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class P02StudentsByFirstAndLastName {
	// Compare students by first name P01
	public static Comparator<String> firstName = Comparator.comparing(x -> x.split("\\s")[0]);
	public static Comparator<String> firstNameDescending = (x, y) -> (y.split("\\s+")[0].compareTo(x.split("\\s+")[0]));
	public static Comparator<String> lastName = (x, y) -> (x.split("\\s+")[1].compareTo(y.split("\\s+")[1]));

	// Filter students whose first name is before their last name
	// lexicographically P02
	public static Predicate<String> firstBeforeLast = x -> (x.split("\\s+")[0].compareTo(x.split("\\s+")[1]) < 0);
	// Filter students between 18-24 years old P03
	public static Predicate<String> age = x -> Integer.parseInt(x.split("\\s+")[2]) >= 18 && Integer.parseInt(x.split("\\s+")[2]) <= 24;
	// Filter all students that have email @gmail.com. P05
	public static Predicate<String> gMail = x -> x.split("\\s+")[2].contains("@gmail.com");
	// Filter all students that have phone numbers in Sofia
	public static Predicate<String> phoneNumInSofia = x -> x.split("\\s+")[2].matches("[02\\d+ | \\+3592\\d+]");
	// Filter all students that have at least one mark Excellent (6)
	public static Predicate<String> excellentMark = x -> Arrays.asList(x.split("\\s+")).contains("6");

	// Filter all students that have at least two marks under or equal to 3.
	public static Predicate<List<String>> twoWeakMarks = integers -> {
		int counter = (int) integers.stream().skip(2).map(Integer::parseInt).filter(x -> x <= 3).count();
		return counter >= 2;
	};
	// Filter students enrolled in 2014 and 2015
	public static Predicate<String> enrollwed14or15 = x -> x.split("\\s+")[0].endsWith("15") || x.split("\\s+")[0].endsWith("14");

	public static void main(String[] args) {
		List<String> lines = new ArrayList<String>();
		try (Scanner scan = new Scanner(System.in)) {
			String line = scan.nextLine();
			while (!line.equals("END")) {
				lines.add(line);

				line = scan.nextLine();
			}
		}

		// P04
		// Sorting with Collections
		//
		// Collections.sort(lines,
		// firstName2.thenComparing(lastNameDescending));
		// lines.forEach(System.out::println);

		// P04
		// Sort/Filter and print with Stream API
		//

		lines.stream().filter(x -> enrollwed14or15.test(x))
					  .forEach(System.out::println);
		
		
//		use predicate.test(x) or just ->
//		lines.stream().filter(enrollwed14or15)
//		  .forEach(System.out::println);
	}
}

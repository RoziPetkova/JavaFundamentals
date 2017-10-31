package lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class P03FirstName {
	public static void main(String[] args) {
		List<String> names;
		Set<String> letters;
		try (Scanner scan = new Scanner(System.in)) {
			names = new ArrayList<String>(Arrays.asList(scan.nextLine().split("\\s+")));
			letters = new HashSet<String>(Arrays.asList(scan.nextLine().split("\\s+")));
		}
		String letter = letters.stream().sorted().collect(Collectors.toList()).get(0).toUpperCase();
		Optional<String> name = names.stream()
									.filter(x -> x.startsWith(letter.toString()))
									.sorted()
									.findFirst();
		
		//name.ifPresent(System.out::print);
		String toPrint = name.isPresent() ? name.get(): "No match";
		System.out.println(toPrint);
	}
}

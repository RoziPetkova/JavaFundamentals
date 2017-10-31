package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p07PredicateForNames {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		final Integer n;
		try (Scanner scan = new Scanner(System.in)) {
			n = Integer.parseInt(scan.nextLine());
			names = Arrays.asList(scan.nextLine().split("\\s"))
													.stream()
													.collect(Collectors.toList());
		}
		names = names.stream().filter(x -> x.length()<= n).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
}

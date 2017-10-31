package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p08FindTheSmallestElement {
	public static void main(String[] args) {
		
		Function<List<Integer>, Integer> findMin = x -> x.stream()
														 .sorted()
														 .collect(Collectors.toList())
														 .get(0);

		List<Integer> numbers = new ArrayList<Integer>();
		try (Scanner scan = new Scanner(System.in)) {
			numbers = Arrays.asList(scan.nextLine()
										.split("\\s"))
										.stream().map(Integer::parseInt)
										.collect(Collectors.toList());
		}
		
		// numbers.stream().reduce((x,y) -> x < y ? x : y)...
		
		System.out.println(numbers.lastIndexOf(findMin.apply(numbers)));
	}
}

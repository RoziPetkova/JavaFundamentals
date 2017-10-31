package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p03CustomMinFunction {
	public static void main(String[] args) {
		List<Integer>collection = new ArrayList<Integer>();
		try (Scanner scan = new Scanner(System.in)) {
			collection = Arrays.asList(scan.nextLine().split("\\s+"))
								.stream()
								.map(x ->Integer.parseInt(x))
								.collect(Collectors.toList());
		}
		
		Function<Collection<Integer>, Integer> findMin = x -> x.stream()
																.sorted()
																.collect(Collectors.toList())
																.get(0);
		
		System.out.println(findMin.apply(collection));

	}
}

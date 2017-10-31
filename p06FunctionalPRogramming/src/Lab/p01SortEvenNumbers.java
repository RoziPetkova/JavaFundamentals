package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class p01SortEvenNumbers {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.stream(new Scanner(System.in).nextLine()
				.split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		nums.removeIf(x -> x % 2 != 0);
		StringJoiner joiner = new StringJoiner(", ");
		for (Integer item : nums) {
			joiner.add(item.toString());
		}
		System.out.println(joiner.toString());
		
		joiner = new StringJoiner(", ");
				nums.sort((a, b) -> a.compareTo(b));
		for (Integer item : nums) {
			joiner.add(item.toString());
		}
		System.out.println(joiner.toString());
		
		
		// nums.forEach(System.out::print);
		// System.out.println();
		// nums.stream().sorted((a, b) ->
		// a.compareTo(b)).forEach(System.out::print);
	}
}

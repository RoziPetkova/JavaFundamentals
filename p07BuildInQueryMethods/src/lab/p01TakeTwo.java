package lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01TakeTwo {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(new Scanner(System.in)
							.nextLine()
							.split(" "))
							.stream()
							.map(Integer::parseInt)
							.collect(Collectors.toList());
		
		ints.stream().filter(x -> x >= 10 && x <=20)
			.distinct()
			.limit(2)
			.forEach(x -> System.out.print(x + " "));
	}
}

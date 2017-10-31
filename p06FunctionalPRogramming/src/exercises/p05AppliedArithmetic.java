package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p05AppliedArithmetic {
	public static void main(String[] args) {
		Function<Integer, Integer> add = x -> x + 1;
		Function<Integer, Integer> mul = x -> x * 2;
		Function<Integer, Integer> sub = x -> x - 1;

		List<Integer> numbers = new ArrayList<Integer>();
		String command = "";
		try (Scanner scan = new Scanner(System.in)) {
			numbers = Arrays.asList(scan.nextLine()
					.split("\\s"))
					.stream()
					.map(Integer::parseInt)
					.collect(Collectors.toList());
			command = scan.nextLine();
			
			while (!command.equals("end")) {
				if (command.equals("add"))
					numbers = numbers.stream().map(num -> add.apply(num)).collect(Collectors.toList());
				else if (command.equals("multiply"))
					numbers = numbers.stream().map(num -> mul.apply(num)).collect(Collectors.toList());
				else if (command.equals("subtract"))
					numbers = numbers.stream().map(num -> sub.apply(num)).collect(Collectors.toList());
				else 
					numbers.forEach(x -> System.out.print(x + " "));
				command = scan.nextLine();
			}
		}
	}
}

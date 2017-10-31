package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p06ReverseAndExeclude {
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		final Integer n;
		try (Scanner scan = new Scanner(System.in)) {
			numbers = Arrays.asList(scan.nextLine().split("\\s")).stream().map(Integer::parseInt).collect(Collectors.toList());
			n = Integer.parseInt(scan.nextLine());
		}
		numbers = numbers.stream().filter(x -> x % n != 0).collect(Collectors.toList());
		Collections.reverse(numbers);
		numbers.forEach( x -> System.out.print(x + " "));
	}
}

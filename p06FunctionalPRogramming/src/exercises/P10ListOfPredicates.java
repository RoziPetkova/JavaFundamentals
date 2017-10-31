package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P10ListOfPredicates {
	public static void main(String[] args) {

		BiPredicate<Integer,Integer> isDiv =(x,y) -> x % y == 0;
		Integer num = 0;
		List<Integer> numbers = new ArrayList<Integer>();
		try (Scanner scan = new Scanner(System.in)) {
			num = Integer.parseInt(scan.nextLine());
			numbers = Arrays.asList(scan.nextLine().split("\\s")).stream().map(Integer::parseInt).collect(Collectors.toList());
		}

		final List<Integer> numbers2 = numbers;

		IntStream.range(1, num+1)
			.filter(x -> numbers2.stream().allMatch(y -> isDiv.test(x, y))).forEach(x -> System.out.print(x+" "));;
	}
}

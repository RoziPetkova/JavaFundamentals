package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p02SumNumbers {
	public static void main(String[] args) {
		String[] nums = new Scanner(System.in).nextLine().split(", ");
		Function<String, Integer> parse = x -> Integer.parseInt(x);
		int sum = 0;
		
		for (String string : nums) {
			sum = sum + parse.apply(string);
		}
		System.out.println("Count = " + nums.length);
		System.out.println("Sum = " + sum);
	}
}

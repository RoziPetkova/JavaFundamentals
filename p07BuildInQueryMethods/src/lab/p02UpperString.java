package lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p02UpperString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new Scanner(System.in).nextLine().split(" "));
		Function<String, String> toUpperC = s -> s.toUpperCase();
		
		list.stream().map(s -> toUpperC.apply(s)).forEach( x -> System.out.print( x + " "));
	}
}

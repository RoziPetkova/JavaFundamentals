package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class p04addVAT {
	public static void main(String[] args) throws IOException {
		List<Double> nums = Arrays.asList(new BufferedReader(new InputStreamReader(System.in))
				.readLine().split(", ")).stream()
				.map(Double::parseDouble)
				.collect(Collectors.toList());
		
		UnaryOperator<Double> addVAT = x -> x * 1.2 ;
		
		System.out.println("Prices with VAT:");
		for (Double double1 : nums) {
			String toPrint = String.format("%1$.2f", addVAT.apply(double1)).replace(".", ",");
			System.out.println(toPrint);
		}
		
//		nums.forEach(x -> addVAT.apply(x));
//		System.out.println("Prices with VAT:");
//		nums.forEach(System.out::println);
	}
}

package lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class P04AverageOfDoubles {
	public static void main(String[] args) {
		List<Double> nums;
		List<String> nums2;
//		try (Scanner scan = new Scanner(System.in)) {
//			try {
//				nums = new ArrayList<String>(Arrays.asList(scan.nextLine().split("\\s+"))).stream().map(Double::parseDouble).collect(Collectors.toList());
//				Optional<Double> sum = nums.stream().reduce((x, y) -> x + y);
//
//				String toPrint = sum.isPresent() ? String.format("%.2f", (sum.get() / nums.size())) : "No match";
//				System.out.println(toPrint);
//
//			} catch (Exception e) {
//				System.out.println("No match");
//			}
//
//		}
		try (Scanner scan = new Scanner(System.in)) {
				nums2 = new ArrayList<>(Arrays.asList(scan.nextLine().split("\\s+")));
				OptionalDouble sum = nums2.stream()
											.filter(x -> !x.isEmpty())
											.mapToDouble(Double::valueOf)
											.average();
				if(sum.isPresent())
					System.out.println(sum);
				else
					System.out.println("No match");

				
		}
	}
}

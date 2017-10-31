package lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class P05MinEvenNumber {
	public static void main(String[] args) {

		List<String> nums2;

		try (Scanner scan = new Scanner(System.in)) {
			nums2 = new ArrayList<>(Arrays.asList(scan.nextLine().split("\\s+")));
			Optional <Double> minNum = nums2.stream()
										.filter(x -> !x.isEmpty())
										.map(Double::valueOf)
										.filter(x -> x % 2 == 0)
										.min(Double::compare);
			if (minNum.isPresent())
				System.out.printf("%.2f", minNum.get());
			else
				System.out.println("No match");
		}
	}
}

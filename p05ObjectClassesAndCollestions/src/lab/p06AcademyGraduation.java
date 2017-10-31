package lab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class p06AcademyGraduation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		String name = scan.nextLine();
		Map<String, BigDecimal> studentsList = new TreeMap<>();

		for (int i = 0; i < num; i++) {
			List<Double> scores = Arrays.asList(scan.nextLine().split(" ")).stream().map(Double::parseDouble).collect(Collectors.toList());
			BigDecimal average = new BigDecimal((scores.stream().mapToDouble(Double::doubleValue).sum()) / scores.size());
			studentsList.put(name, average);
			name = scan.nextLine();
		}
		
		
		for (String key : studentsList.keySet()) {
			System.out.printf("%s is graduated with %f", key, studentsList.get(key).stripTrailingZeros());
			System.out.println();
		}
	}
}

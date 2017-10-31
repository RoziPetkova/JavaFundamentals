package lab;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class P07MapDistrict {
	public static void main(String[] args) {
		Comparator<Map.Entry<String, List<Integer>>> comp = (y, x) -> Integer
				.compare((x.getValue().stream().reduce((x1,x2) -> x1 + x2)).get(),
							(y.getValue().stream().reduce((y1,y2) -> y1 + y2)).get());
		Map<String, List<Integer>> allCities = new TreeMap<String, List<Integer>>();
		Integer minimunPop;
		String[] line;
		try (Scanner scan = new Scanner(System.in)) {
			line = scan.nextLine().split("\\s+");
			minimunPop = scan.nextInt();
		}
		
		for (String string : line) {
			String name = string.substring(0,4);
			Integer district = Integer.parseInt(string.substring(4));
			
			allCities.putIfAbsent(name, new ArrayList<>(district));
			allCities.get(name).add(district);
				
		}
		
		allCities.entrySet()
					.stream()
					.filter(x -> (x.getValue().stream().reduce((el1,el2) -> el1+el2 )).get() > minimunPop)
					.sorted(comp)
					.forEach(x -> System.out.printf("%s %s\n", x.getKey(), String.join(" ",  x.getValue()
																							.stream()
																							.sorted((j,y) -> Integer.compare(y, j))
																							.limit(5)
																							.map(num -> num.toString())
																							.collect(Collectors.toList()))));
	}
}

package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class p10CountingSymbols {
	public static void main(String[] args) {
		String str = "";

		try (Scanner scan = new Scanner(System.in)) {
			str = scan.nextLine();
		}

		Map<Character, Integer> counter = new TreeMap<>();
		for (Character ch : str.toCharArray()) {
			if (counter.containsKey(ch))
				counter.put(ch, counter.get(ch) + 1);
			else
				counter.put(ch, 1);
		}

		counter.entrySet().forEach(e -> System.out.printf("%s: %d time/s\n", e.getKey(), e.getValue()));
		
	}
}

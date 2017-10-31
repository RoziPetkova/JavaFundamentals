package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class p05FilterByAge {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());
		Map<String, Integer> list = new LinkedHashMap<>();

		while (count > 0) {
			String[] line = reader.readLine().split(", ");
			list.put(line[0], Integer.parseInt(line[1]));
			count--;
		}
		String condition = reader.readLine();
		int age = Integer.parseInt(reader.readLine());
		String format = reader.readLine();
		
		
		for (String name : list.keySet()) {
			if (isOk(name, list.get(name), age, condition)) {
				formatPrint(format, name, list.get(name));
			}
		}
	}
	
	
	public static void formatPrint(String format, String name, int age) {
		switch (format) {
		case "name age":
			System.out.println(name + " - " + age);
			break;
		case "name":
			System.out.println(name);
			break;
		case "age":
			System.out.println(age);
			break;
		}
	}
	public static Boolean isOk(String name, int age, int compareTo, String youngerOrNot) {
		BiFunction<Integer, Integer, Boolean> greater = (x, y) -> x.compareTo(y) < 0;
		BiFunction<Integer, Integer, Boolean> less = (x, y) -> x.compareTo(y) >= 0;
		switch (youngerOrNot) {
		case "younger":
			return greater.apply(age, compareTo);
		case "older":
			return less.apply(age, compareTo);
		}
		return null;
	}
}

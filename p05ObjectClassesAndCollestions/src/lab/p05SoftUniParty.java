package lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class p05SoftUniParty {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		Set<String> guests = new TreeSet<>();

		while (!line.equals("PARTY")) {
			guests.add(line);
			line = scan.nextLine();
		}
		
		line = scan.nextLine();
		while (!line.equals("END")) {
			guests.remove(line);
			line = scan.nextLine();
		}

		System.out.println(guests.size());
		guests.stream().filter(x -> Character.isDigit(x.charAt(0))).collect(Collectors.toList()).forEach(System.out::println);
		guests.stream().filter(x -> Character.isLetter(x.charAt(0))).collect(Collectors.toList()).forEach(System.out::println);

	}

}

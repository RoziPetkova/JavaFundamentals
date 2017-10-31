package exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p13HandsOfCards {
	public static void main(String[] args) {
		Map<String, String> players = new LinkedHashMap<>();

		String name = "";
		String cards = "";
		try (Scanner scan = new Scanner(System.in)) {
			String line = scan.nextLine();
			while (!line.equals("JOKER")) {
				name = line.split(": ")[0];
				cards = line.split(": ")[1];
				if (players.containsKey(name))
					players.put(name, players.get(name).concat(", " + cards));
				else
					players.put(name, cards);
				line = scan.nextLine();
			}
			// players.keySet().forEach(x ->
			// System.out.printf("%s key value %s\n", x, players.get(x)));
		}
		
		players.keySet().forEach(x -> System.out.printf("%s: %d\n", x, sumCards(players.get(x))));
		
		
	}
	public static int  sumCards(String strCarsd) {
		List<String> cardsList = Arrays.asList(strCarsd.split(", "))
				.stream()
				.distinct()
				.collect(Collectors.toList());
		return cardsList.stream()
						.mapToInt(x -> calculate(x))
						.sum();
		
	}
	private static int calculate(String x) {
		int second = x.charAt(x.length() - 1) == 'S' ? 4 
				  :  x.charAt(x.length() - 1) == 'H' ? 3
				  :  x.charAt(x.length() - 1) == 'D' ? 2
				  :  x.charAt(x.length() - 1) == 'C' ? 1 : 0;
		
		x = x.substring(0, x.length() - 1);
		int first = 0;
		try {
			first = Integer.parseInt(x);
		} catch (Exception e) {
			first = x.equals("J") ? 11 
					:  x.equals("Q") ? 12
						:  x.equals("K") ? 13
							:  x.equals("A") ? 14 : 1;
		}
		return first  * second;
		
	}
}

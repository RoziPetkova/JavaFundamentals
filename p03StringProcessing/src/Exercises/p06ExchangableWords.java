package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p06ExchangableWords {
	public static void main(String[] args) throws IOException {
		String[] words = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		String shortest = words[0].length() <= words[1].length() ? words[0] : words[1];
		String largest = words[0].length() > words[1].length() ? words[0] : words[1];
		Map<Character, Character> map = new HashMap<>();
		boolean areMagic = true;

		for (int i = 0; i < shortest.length(); i++) {
			if (!map.containsKey(shortest.charAt(i))) {
				if (!map.containsValue(largest.charAt(i))) {
					map.put(shortest.charAt(i), largest.charAt(i));
				}else {
					areMagic = false;
					break;
				}
			}else {
				if (map.get(shortest.charAt(i)) != largest.charAt(i)) {
					areMagic = false;
					break;
				}
			}
		}
		
		if (shortest.length() != largest.length()) {
			for (int i = shortest.length(); i < largest.length(); i++) {
				if (map.containsValue(largest.charAt(i)))
					continue;
				else 
					areMagic = false; 
			}
		}
		
		System.out.println(areMagic);
	}
}

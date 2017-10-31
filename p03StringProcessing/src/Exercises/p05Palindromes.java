package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class p05Palindromes {
	public static void main(String[] args) throws IOException {
		String[] text = new BufferedReader(new InputStreamReader(System.in)).readLine().split("[, .?!]+");
		Set<String> palindromes = new TreeSet();
		
		for (String string : text) {
			if (isPalindrome(string))	
				palindromes.add(string);
		}
		
		System.out.println(palindromes);
	}
	public static boolean isPalindrome(String word) {
		int middle = word.length() / 2;
		boolean toReturn = true;
		for (int i = 0; i < middle; i++) {
			if (word.toCharArray()[i] != word.charAt(word.length() - 1 - i)) {
				toReturn = false;
			}
		}
		return toReturn;
		
	}
}

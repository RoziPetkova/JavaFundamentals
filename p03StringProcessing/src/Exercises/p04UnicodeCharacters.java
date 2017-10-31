package Exercises;

import java.util.Scanner;

public class p04UnicodeCharacters {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		String output = "";
		
		for (Character character : input.toCharArray()) {
			output = output.concat(String.format("\\u%04x", (int)character));
		}
		
		System.out.println(output);
	}
}

package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class p03TextFilter {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] bannedWords = reader.readLine().split(", ");
		String text = reader.readLine();

		for (String string : bannedWords) {
			if (text.contains(string)) {
			 text = text.replaceAll(string, String.join("", Collections.nCopies(string.length(), "*")));
			}
		}
		System.out.println(text);
	}

}

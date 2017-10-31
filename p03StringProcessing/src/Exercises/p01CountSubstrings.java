package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01CountSubstrings {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine().toLowerCase();
		Pattern pattern = Pattern.compile(reader.readLine().toLowerCase());
		
		Matcher match = pattern.matcher(line);
		int counter = 0;
		int lastIndex = 0;
		while (match.find(lastIndex)) {
			lastIndex = match.end() - 1;
			counter++;
		}
		System.out.println(counter);
		
	}
}

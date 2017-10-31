package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class P12LittleJohn {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String text = "";
		int counter = 0;
		while (counter < 4) {
			text = text + " " + read.readLine();
			counter++;
		}
		// Counting arrows
		int bArrows = countOfOccurrences(text, ">>>----->>");
		text = text.replaceAll(">>>----->>", "d");
		int mArrows = countOfOccurrences(text, ">>----->");
		text = text.replaceAll(">>----->", "d");
		int sArrows = countOfOccurrences(text, ">----->");
		String concat = sArrows + "" + mArrows + bArrows;
		
		List<String> inBinary = Arrays.asList(Integer.toBinaryString(Integer.parseInt(concat)).split(""));
		String stringche = String.join("", inBinary);
		Collections.reverse(inBinary);
		stringche = stringche.concat(String.join("", inBinary));
		
		
		int result = Integer.parseInt(stringche, 2);
		
		System.out.println(result);
		

	}

	public static int countOfOccurrences(String str, String subStr) {
		return (str.length() - str.replaceAll(Pattern.quote(subStr), "").length()) / subStr.length();
	}

	public static int countSubstrings(String str, String subStr) {

		int numberOfMatches = 0;
		while (str.contains(subStr)) {
			str = str.replaceFirst(subStr, "-");
			numberOfMatches++;
		}
		return numberOfMatches;
	}
}

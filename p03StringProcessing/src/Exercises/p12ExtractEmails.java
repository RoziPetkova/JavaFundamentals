package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p12ExtractEmails {
	public static void main(String[] args) throws IOException {
		Pattern pattern = Pattern.compile("([a-z]+[A-Za-z.-_]+@)([a-z.-]{2,})"); // ("([^\s][a-z]{1}[A-Za-z.-_]+@)([a-z.]{2,}[.,\s$])")
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		String text = "";

		while (!line.equals("end")) {
			text = text + line + " ";
			line = reader.readLine();
		}

		Matcher matches = pattern.matcher(text);

		List<String> allMatches = new ArrayList<>();
		while (matches.find()) {
			allMatches.add(matches.group());
		}
		
		allMatches.forEach(x -> System.out.println(x));

	}
}

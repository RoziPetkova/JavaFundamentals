package p03StringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p03ParseTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		// Pattern uppercase = Pattern.compile("<upcase>");
		// Pattern endUppercase = Pattern.compile ( "</upcase>");

		Pattern patt = Pattern.compile("<upcase>(.+?)<\\/upcase>");
		Matcher matches = patt.matcher(text);
		// Matcher upmatcher = uppercase.matcher(text);
		// Matcher endUpmatcher = endUppercase.matcher(text);

		while (matches.find()) {
			text = text.replace(matches.group(1), matches.group(1).toUpperCase());
			text = text.replaceAll("<upcase>", "");
			text = text.replaceAll("</upcase>", "");

		}

		System.out.println(text);
	}
}

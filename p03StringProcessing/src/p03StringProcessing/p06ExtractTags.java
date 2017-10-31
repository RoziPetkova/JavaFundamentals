package p03StringProcessing;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p06ExtractTags {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Scanner scan = new Scanner(System.in);
		Pattern pattern = Pattern.compile("<(.*?)>");
		// Matcher mach = null;

		String text = scan.nextLine();
		while (!text.equals("END")) {
			Matcher matcher = pattern.matcher(text);
			while (matcher.find())
			System.out.println(matcher.group());
			text = scan.nextLine();
		}

	}

}

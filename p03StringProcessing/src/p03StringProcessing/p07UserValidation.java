package p03StringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p07UserValidation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");

		String text = scan.nextLine();
		while (!text.equals("END")) {
			Matcher matcher = pattern.matcher(text);
			if (matcher.find()) {
				System.out.println("valid");
			}
			else{
				System.out.println("invalid");
			}
			text = scan.nextLine();
		}

	}
}

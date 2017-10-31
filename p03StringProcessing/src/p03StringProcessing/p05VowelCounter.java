package p03StringProcessing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p05VowelCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Pattern pattern = Pattern.compile("[a|e|i|o|u|y|A|E|O|U|Y|I]");

		String text = scan.nextLine();
		Matcher matches = pattern.matcher(text);

		int num = 0;

		while (matches.find()) {
			num++;
			text.replaceFirst("[a|e|i|o|u|y|A|E|O|U|Y|I]", "");
		}
		System.out.println("Vowels: " + num);

	}

}

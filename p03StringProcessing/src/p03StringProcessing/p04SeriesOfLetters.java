package p03StringProcessing;

import java.util.Scanner;

public class p04SeriesOfLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		int state = 0;
		String result = "";
		for (int i = 1; i < line.length(); i++) {
			switch (state) {
			case 0:
				if (line.charAt(i) == line.charAt(i - 1)) {
					state = 2;
				} else {
					state = 1;
					result = result + line.charAt(i - 1);
				}
			case 1:
				if (line.charAt(i) == line.charAt(i - 1)) {
					state = 2;
				} else {
					result = result + line.charAt(i - 1);
				}

				break;
			case 2:
				if (line.charAt(i) == line.charAt(i - 1)) {
					state = 2;
				} else {
					result = result + line.charAt(i - 1);
					state = 1;
				}
				break;
			default:
				break;
			}
		}
		System.out.println(result);
	}

}

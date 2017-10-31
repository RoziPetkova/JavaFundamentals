package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p11Phonebook {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Map<String, String> phoneBook = new HashMap<String, String>();

			String line = scan.nextLine();

			while (!line.equals("search")) {
				String[] nameAndNumber = line.split("-");
				phoneBook.put(nameAndNumber[0], nameAndNumber[1]);
				line = scan.nextLine();
			}
			line = scan.nextLine();
			while (!line.equals("stop")) {
				if (phoneBook.containsKey(line)) {
					System.out.printf("%s -> %s\n", line, phoneBook.get(line));
				} else {
					System.out.printf("Contact %s does not exist.\n", line);
				}
				line = scan.nextLine();
			}
		}
	}
}

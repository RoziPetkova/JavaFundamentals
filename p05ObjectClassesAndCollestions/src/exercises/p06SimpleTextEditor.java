package exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class p06SimpleTextEditor {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int commands = Integer.parseInt(scan.nextLine());
		String text = "";

		Deque<String> memory = new ArrayDeque<>();

		while (commands > 0) {
			String[] line = scan.nextLine().split("\\s+");
			switch (line[0]) {
			case "1":
				memory.push(text);
				text = text + (line[1]);
				break;
			case "2":
				memory.push(text);
				text = text.substring(0, text.length() - Integer.parseInt(line[1]));
				break;
			case "3":
				System.out.println(text.charAt(Integer.parseInt(line[1]) - 1));
				break;
			case "4":
				text = memory.pop();
				break;
			}
			commands--;
		}

	}
}

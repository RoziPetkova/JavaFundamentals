package exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class p02MaximumElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int commands = Integer.parseInt(scan.nextLine());
		Deque<Integer> stack = new ArrayDeque<>();
		int maxElement = Integer.MIN_VALUE;

		while (commands > 0) {
			String line = scan.nextLine();
			switch (line.charAt(0)) {
			case '1':
				stack.push(Integer.parseInt(line.substring(2)));
				break;
			case '2':
				stack.pop();
				break;
			case '3':
				for (Integer integer : stack) {
					if(maxElement < integer)
						maxElement = integer;
				}
				System.out.println(maxElement);
				maxElement = Integer.MIN_VALUE;
				break;
			}
			commands--;
		}

	}

}

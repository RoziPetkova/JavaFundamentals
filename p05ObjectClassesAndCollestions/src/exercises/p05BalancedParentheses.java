package exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class p05BalancedParentheses {
	public static void main(String[] args) {
		char[] str;
		
		try(Scanner scan = new Scanner(System.in)) {
			str = scan.nextLine().toCharArray();
		}
		
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for (int i = 0; i < str.length / 2; i++) {
			stack.push(str[i]);
		}
		
		for (int i = str.length / 2 ; i < str.length; i++) {
			switch (stack.peek()) {
			case '[':
				if (str[i] == ']')
					stack.pop();
				else break;
				break;
			case '{':
				if (str[i] == '}')
					stack.pop();
				else break;
				break;
			case '(':
				if (str[i] == ')')
					stack.pop();
				else break;
				break;
			}
		}
		
		if (stack.size() > 0) 
			System.out.println("NO");
		else
			System.out.println("YES");

	}
}

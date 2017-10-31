package lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class p01MatchingBrackets {
	public static void main(String[] args) {
		String line =  new Scanner(System.in).nextLine();
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == '(') 
				stack.push(i);
			if (line.charAt(i) == ')') 
				System.out.println(line.substring(stack.pop(), i+1));
		}
	}
}

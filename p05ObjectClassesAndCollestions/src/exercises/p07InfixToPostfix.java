package exercises;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class p07InfixToPostfix {
	public static void main(String[] args) {
		List<String> input = Arrays.asList(new Scanner(System.in).nextLine().split(" "));
		List<String> output = new LinkedList<>();
		output = postFix(input);
		
		System.out.printf("%.2f", calculatePostFix(output));


	}

	public static double calculatePostFix(List<String> expression) {
		double result = 0;
		Deque<Double> integers = new ArrayDeque<>();

		for (int i = 0; i < expression.size(); i++) {
			if (expression.get(i).matches("[a-zA-Z0-9]+")) {
				integers.push(Double.parseDouble(expression.get(i)));
			} else if (expression.get(i).matches("[\\+\\*\\-\\/]")) {
				switch (expression.get(i)) {
				case "+":
					integers.push(integers.pop() + integers.pop());
					break;
				case "*":
					integers.push(integers.pop() * integers.pop());
					break;
				case "-":
					double temp = integers.pop();
					integers.push(integers.pop() - temp);
					break;
				case "/":
					temp = integers.pop();
					integers.push(integers.pop() / temp);
					break;
				}
			}
		}
		
		if(integers.size() == 1)
			result =  integers.pop();
		return result;

	}

	public static List<String> postFix(List<String> input) {
		List<String> output = new LinkedList<>();
		Deque<String> opStack = new ArrayDeque<>();

		for (int i = 0; i < input.size(); i++) {
			if (input.get(i).matches("[a-zA-Z0-9]+"))
				output.add(input.get(i));
			else if (input.get(i).equals("("))
				opStack.push(input.get(i));
			else if (input.get(i).equals(")")) {
				while (!(opStack.peek().equals("("))) {
					output.add(opStack.pop());
				}
				opStack.pop();
			} else if (input.get(i).matches("[\\+\\*\\-\\/]")) {
				while (getPrecedence(opStack.peek(), input.get(i))) {
					output.add(opStack.pop());
				}
				opStack.push(input.get(i));
			}
		}
		while (opStack.size() > 0)
			output.add(opStack.pop());

		return output;
	}

	public static boolean getPrecedence(String operator1, String operator2) {
		if (operator1 == null) {
			return false;
		}
		int op1 = operator1.equals("*") ? 3 : operator1.equals("/") ? 3 : operator1.equals("+") ? 2 : operator1.equals("-") ? 2 : 1;
		int op2 = operator2.equals("*") ? 3 : operator2.equals("/") ? 3 : operator2.equals("+") ? 2 : operator2.equals("-") ? 2 : 1;
		return op1 >= op2;

	}
}

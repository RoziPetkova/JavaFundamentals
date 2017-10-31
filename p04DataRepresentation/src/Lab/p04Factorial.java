package Lab;

import java.util.Scanner;

public class p04Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		System.out.println(factorial(a));
	}

	private static int factorial(int a) {
		return a == 1 ? 1 : a * factorial(a - 1);
	}

}

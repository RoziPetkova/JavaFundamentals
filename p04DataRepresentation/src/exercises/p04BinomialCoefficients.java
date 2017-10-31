package exercises;

import java.util.Scanner;

public class p04BinomialCoefficients {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int k = Integer.parseInt(scan.nextLine());
		
//		System.out.println(factorial(n));	
//		System.out.println(factorial(k));
//		System.out.println(factorial(n - k));
		
		System.out.println(combinationsCounting(n, k));
	}

	public static long combinationsCounting(int n, int k) {
		return factorial(n) / (factorial(n-k) * factorial(k));
	}

	private static long factorial(int k) {
		return k <= 1 ? 1 : k * factorial( k - 1);
		
	}
}

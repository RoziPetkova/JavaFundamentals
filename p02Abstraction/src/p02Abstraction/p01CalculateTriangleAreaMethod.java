package p02Abstraction;

import java.util.Scanner;

public class p01CalculateTriangleAreaMethod {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 double base = scanner.nextDouble();
		 double height = scanner.nextDouble();
		 
		 System.out.printf("Area = %.2f", thriangleAres(base, height));
		 
	}
	public static double thriangleAres(double base, double height) {
		
		return (base * height / 2);
	}
}

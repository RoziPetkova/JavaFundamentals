package exercises;

import java.util.Scanner;

public class p03DiagonalDifference {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.nextLine();

		int rightSum = 0;
		int leftSum = 0;

		for (int i = 0; i < number; i++) {
			String[] line = scan.nextLine().split(" ");
			rightSum += Integer.parseInt(line[i]);
			leftSum += Integer.parseInt(line[line.length - i - 1]);
		}

		System.out.println(Math.abs(rightSum - leftSum));
	}
}

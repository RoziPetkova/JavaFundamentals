package exercises;

import java.util.Scanner;

public class p06Second {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int intervalsCount = Integer.parseInt(scan.nextLine());

		int[][] intervals = new int[intervalsCount][2];

		boolean thereIsOverlap = false;

		// Filling the matrix
		for (int i = 0; i < intervalsCount; i++) {
			String[] input = scan.nextLine().split(",");
			for (int j = 0; j < 2; j++) {
				intervals[i][j] = Integer.parseInt(input[j]);
			}
		}

		// Check for overlap
		outerloop: for (int i = 0; i < intervals.length; i++) {
			for (int j = i + 1; j < intervals.length; j++) {
				if (intervals[i][1] >= intervals[j][0] && intervals[i][0] < intervals[j][1]) {
					thereIsOverlap = true;
					break outerloop;
				}
			}
		}
		System.out.println(thereIsOverlap);
	}
}

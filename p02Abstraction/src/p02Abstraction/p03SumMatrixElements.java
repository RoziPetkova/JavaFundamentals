package p02Abstraction;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03SumMatrixElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] firstLine = scan.nextLine().split(", ");
		int rows = Integer.parseInt(firstLine[0]);
		int columns = Integer.parseInt(firstLine[1]);
		int biggestCombination = 0; 

		int sum = 0;
		for (int i = 0; i < rows; i++) {
			String[] row = scan.nextLine().split(", ");
			for (int j = 0; j < row.length; j++) {
				sum = Integer.parseInt(row[j]);
			}
		}
		System.out.println(rows);
		System.out.println(columns);
		System.out.println(sum);

	}

}

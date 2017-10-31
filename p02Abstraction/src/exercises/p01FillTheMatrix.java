package exercises;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

public class p01FillTheMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(", ");
		int[][] array = new int[Integer.parseInt(line[0])][Integer.parseInt(line[0])];

		if (line[1].equals("A")) {
			a(array, Integer.parseInt(line[0]));
		} else {
			b(array, Integer.parseInt(line[0]));
		}
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				System.out.print(array[row][col] + " ");
			}		
			System.out.println();
		}
	}

	public static void a(int[][] arr, int number) {
		int counter = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = counter;
				counter++;
			}
		}
	}

	public static void b(int[][] arr, int number) {
		int counter = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i % 2 == 1) {
					arr[number - j - 1][i] = counter;
				} else {
					arr[j][i] = counter;
				}
				counter++;
			}
		}
	}

}

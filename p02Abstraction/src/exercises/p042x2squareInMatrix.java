package exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p042x2squareInMatrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int coloumns = scan.nextInt();

		char[][] array = new char[rows][coloumns];
		for (int i = 0; i < rows; i++) {
			array[i] = scan.nextLine().replace(" ", "").toCharArray();
		}

		int counter = 0;
		for (int row = 0; row < array.length -1 ; row++) {
			for (int coloumn = 0; coloumn < array[row].length - 1; coloumn++) {

				int gg = (array[row][coloumn] == array[row + 1][coloumn + 1])
						&& ( array[row][coloumn + 1] == array[row + 1][coloumn])
						&& ( array[row][coloumn] == array[row + 1][coloumn])
						? 1 :0;
				counter = counter + gg;
			}
		}
		System.out.println(counter);
	}
}

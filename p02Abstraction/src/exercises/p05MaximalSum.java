package exercises;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p05MaximalSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int coloumns = scan.nextInt();

		Integer[][] array = new Integer[rows][coloumns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {

				array[i][j] = scan.nextInt();
			}
		}

		int sum = 0;
		for (int row = 0; row < rows - 2; row++) {
			for (int coloumn = 0; coloumn < coloumns - 2; coloumn++) {
				
				int currentSum = array[row][coloumn] + array[row][coloumn + 1] + array[row][coloumn + 2];
				int secRow =     array[row + 1][coloumn] + array[row + 1][coloumn + 1] + array[row + 1][coloumn + 2];
				int thirdRow =   array[row + 2][coloumn] + array[row + 2][coloumn + 1] + array[row + 2][coloumn + 2];
				
				sum = currentSum > sum ? currentSum + secRow + thirdRow: sum;
			}
		}
		System.out.println(sum);
	}
}

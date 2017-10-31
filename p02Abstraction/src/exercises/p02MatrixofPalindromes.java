package exercises;

import java.util.Scanner;

public class p02MatrixofPalindromes {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		String[][] array = new String[Integer.parseInt(line[0])][Integer.parseInt(line[1])];
		
		/*Rows define the first and the last letter: row 0  �?a’, row 1  �?b’, row 2  �?c’, …
		 Columns + rows define the middle letter:
		o column 0, row 0  �?a’, column 1, row 0  �?b’, column 2, row 0  �?c’, …
		o column 0, row 1  �?b’, column 1, row 1  �?c’, column 2, row 1  �?d’,  */

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = makeString(i, j);
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}

	private static String makeString(int row, int column) {
		// TODO Auto-generated method stub
		char firstAndLastLetter =  (char) (97+row);
		char middle =  (char) (97+row+column);
		String word = Character.toString(firstAndLastLetter) + middle + firstAndLastLetter;
		
		return word ;
	}

}

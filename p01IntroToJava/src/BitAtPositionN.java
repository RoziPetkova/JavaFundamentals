

import java.math.BigInteger;
import java.util.Scanner;

public class BitAtPositionN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int position = scanner.nextInt();
		//String inBit = intToBinary(number, 32);
		//System.out.println(inBi t.charAt(inBit.length() - position - 1));
		int mask = number >> position; 
		int bit = mask & 1; 
		System.out.println(bit);
	}

	public static String intToBinary(int n, int numOfBits) {
		String binary = "";
		for (int i = 0; i < numOfBits; ++i, n /= 2) {
			switch (n % 2) {
			case 0:
				binary = "0" + binary;
				break;
			case 1:
				binary = "1" + binary;
				break;
			}
		}

		return binary;
	}

}

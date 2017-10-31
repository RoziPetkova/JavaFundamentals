

import java.math.BigInteger;
import java.util.Scanner;

public class ModifyABit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int position = scanner.nextInt();
		String inBit = intToBinary(number, 32);
		System.out.println(inBit.charAt(inBit.length() - position - 1));
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

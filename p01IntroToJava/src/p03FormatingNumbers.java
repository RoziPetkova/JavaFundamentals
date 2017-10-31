
import java.util.Scanner;

public class p03FormatingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int firstNum = sc.nextInt();
		double secondNum = sc.nextDouble();
		double thirdNum = sc.nextDouble();

		String inHexa = inHexa(firstNum);

		System.out.println("|" + inHexa + "|" + intToBinary(firstNum, 10) 
				+ "|" + formatSecondNum(secondNum)+ "|" + formatThirdNum(thirdNum)+ "|");
	}

	public static String inHexa(int n) {
		StringBuilder sb = new StringBuilder("         ");
		String intInHex = Integer.toHexString(n);
		sb.replace(0, intInHex.length() - 1, intInHex.toUpperCase());
		String result = sb.toString();
		return result;
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

	public static String formatSecondNum(double number) {
		StringBuilder sb = new StringBuilder("         ");
		String doubleInStr = String.format("%.2f",number);
				
		sb.replace(10 - doubleInStr.length(), sb.length(), doubleInStr );
		String result = sb.toString();
		return result;
	}
	public static String formatThirdNum(double number) {
		StringBuilder sb = new StringBuilder("         ");
		String doubleInStr = String.format("%.3f",number);
				
		sb.replace(0, doubleInStr.length() - 1, doubleInStr );
		String result = sb.toString();
		return result;
	}
}

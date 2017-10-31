package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p08MulBigDigits {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String number = reader.readLine();
		int n = Integer.parseInt(reader.readLine());

		System.out.println(mulBigNumbers(number, n, 0));
	}

	public static String mulBigNumbers(String number, int a, int remainder) {
		String resultStr = "";
		String toConcate = "";
		

		if (number.length() == 1) {
			resultStr = "" + (Integer.parseInt(number) * a + remainder);
		} else {
			int currentdigit = Integer.parseInt(number.substring(number.length() - 1));
			int curRes = currentdigit * a  + remainder;
			remainder = curRes >= 10 ? curRes / 10 : 0;
			int numToConc = curRes >= 10 ? curRes % 10 : curRes;
			String toConcat = "" + (numToConc);
			resultStr = resultStr.concat(mulBigNumbers(number.substring(0, number.length() - 1), a, remainder)) + toConcat;
		}
		if(a ==0 )
			resultStr = "0";
		return resultStr;
	}
}

package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//First you start with the letter before the number. If it's Uppercase you divide the number by the letter's position in
//the alphabet. If it's lowercase you multiply the number with the letter's position. Then you move to the letter after
//the number. If it's Uppercase you subtract its position from the resulted number. If it's lowercase you add its
//position to the resulted number. 

public class p07LettersChangeNumbers {
	public static void main(String[] args) throws IOException {
		String[] line = new BufferedReader(new InputStreamReader(System.in)).readLine().split("[ \t]+");
		double sum = 0;

		for (String string : line) {
			
			sum = sum +sumString(string);
		}
		System.out.printf("%.2f", sum);



	}

	public static double sumString(String str) {
		int first = (int) str.charAt(0);
		int last = (int) str.charAt(str.length() - 1);
		double middle = Long.parseLong(str.substring(1, str.length() - 1));
		double result = 0;
		if (first <= 90) {
			first = first - 64;
			result = middle / first;
		} else {
			first = first - 96;
			result = first * middle;
		}
		if (last <= 90) {
			last = last - 64;
			result = result - last;
		} else {
			last = last - 96;
			result = result + last;
		}
		return result;

	}
}

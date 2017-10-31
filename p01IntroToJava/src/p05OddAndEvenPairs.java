import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class p05OddAndEvenPairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numbersInStr = sc.nextLine();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		fillTheArray(numbersInStr, numbers);

		if (numbers.size() % 2 != 0) {
			System.out.println("invalid length");
		} else {
			for (int i = 0; i < numbers.size() - 1; i = i + 2) {
				System.out.println(checkPair(numbers.get(i), numbers.get(i + 1)));
			}
		}
	}

	public static void fillTheArray(String numbers, ArrayList<Integer> array) {
		String[] nums = numbers.split(" ", numbers.length() - 1);
		for (String num : nums) {
			array.add(Integer.parseInt(num));
		}
	}

	public static String checkPair(int first, int second) {
		String result = "";
		if (first % 2 != second % 2) {
			result = String.format("%d, %d -> different", first, second);
		} else {
			if (first % 2 == 0) {
				result = String.format("%d, %d -> both are even", first, second);
			} else {
				result = String.format("%d, %d -> both are odd", first, second);
			}
		}
		return result;
	}
}

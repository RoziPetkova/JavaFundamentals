import java.util.ArrayList;
import java.util.Scanner;

public class p07CharacterMultiplier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] str = line.split(" ");
		ArrayList<Integer> firstStr = new ArrayList<Integer>();
		numbering(str[0], firstStr);
		ArrayList<Integer> secondStr = new ArrayList<Integer>();
		numbering(str[1], secondStr);
		System.out.printf("%.0f", multiplyLists(firstStr, secondStr));

	}

	public static void numbering(String word, ArrayList<Integer> numbers) {
		for (int i = 0; i < word.length(); i++) {
			numbers.add((int) word.charAt(i));
		}
	}

	public static double multiplyLists(ArrayList<Integer> first, ArrayList<Integer> second) {
		double result = 0;
		for (int i = 0; i < Math.min(second.size(), first.size()); i++) {
			result = result + second.get(i) * first.get(i);
		}
		if (first.size() != second.size()) {
			ArrayList<Integer> newArr = first.size() > second.size() ? first : second;
			for (int i = Math.min(first.size(), second.size()); i < newArr.size(); i++) {
				result = result + newArr.get(i);
			}
		}

		return result;
	}
}

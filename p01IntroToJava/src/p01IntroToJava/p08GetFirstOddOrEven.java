package p01IntroToJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class p08GetFirstOddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer> line1 = Arrays.asList((scan.nextLine().split(" ")))
							  .stream().map(Integer::parseInt).collect(Collectors.toList());
		List<String> line2 = Arrays.asList((scan.nextLine().split(" ")));
		int counter = Integer.parseInt(line2.get(1));
		String evenOrOdd = line2.get(2);

		for (int i = 0; i < line1.size(); i++) {
			if (line1.get(i) % 2 == (evenOrOdd.equals("even") ? 0 : 1)) {
				System.out.print(line1.get(i) + " ");
				counter--;
			}
			if (counter < 0)
				break;
		}
	}
}

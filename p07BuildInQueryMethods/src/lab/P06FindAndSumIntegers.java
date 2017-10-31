package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class P06FindAndSumIntegers {
	public static void main(String[] args) throws IOException {
		List<String> list = new ArrayList<String>(Arrays.asList(new BufferedReader(new InputStreamReader(System.in))
									.readLine().split("\\s+")));

		Optional<Integer> sum = list.stream()
				.filter(x -> Character.isDigit(x.charAt(x.length() - 1)))
				.map(Integer::parseInt)
				.reduce((x, y) -> x + y);

		if(sum.isPresent())
			System.out.println(sum.get());
		else {
			System.out.println("No match");
		}
	}
}

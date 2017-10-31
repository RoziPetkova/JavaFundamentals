package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class p07FindTheMissingInt {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(reader.readLine());
		List<Long> list = Arrays.asList(reader.readLine().split(", ")).stream().map(Long::parseLong).collect(Collectors.toList());

		list = list.stream().sorted().collect(Collectors.toList());

		long num = 0;
		if (list.get(0) != 1)
			num = 1;
		else if (list.get(list.size() - 1) != n)
			num = n;
		else {
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) + 1 != list.get(i + 1)) {
					num = list.get(i + 1) - 1;
					break;
				}
			}
		}
		System.out.println(num);
	}

}

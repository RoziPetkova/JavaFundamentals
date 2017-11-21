import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WorkPlace {
	public static void main(String[] args) {

		List<String> numbers = new ArrayList<String>();
		numbers.addAll(Arrays.asList("s", "ss", "sss"));

		Collections.sort(numbers, (x, y) -> x.length() < y.length() ? 1 : -1);
		
		numbers.forEach(System.out::println);
	}
}

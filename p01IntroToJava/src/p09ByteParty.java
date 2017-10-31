import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p09ByteParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter = Integer.parseInt(sc.nextLine());
		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < counter; i++) {
			numbers.add(Integer.parseInt(sc.nextLine()));
		}
		String command = "";
		while (!command.equals("party over")) {
			command = sc.nextLine();
			if (command.equals("party over")) {
				for (Integer integer : numbers) {
					System.out.println(integer);
				}
				break;
			}
			for (Integer integer : numbers) {
				refactor(integer, command);
			}
		}

	}

	private static void refactor(Integer integer, String command) {

		int possition = Integer.parseInt(Arrays.asList(command.split(" ")).get(1));
		switch (Arrays.asList(command.split(" ")).get(0)) {
		case "-1":
			integer = integer ^ (1 << possition);
			break;
		case "1":
			integer = integer ^ (1 << possition);
			
			break;
		case "0":
			break;
		}

	}

}

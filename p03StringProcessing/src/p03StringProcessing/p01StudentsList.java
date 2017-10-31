package p03StringProcessing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p01StudentsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

	//	int num = Integer.parseInt(scan.nextLine());
		Map<String, ArrayList<Double>> map = new HashMap<String, ArrayList<Double>>();

	//	while (num > 0) {
			String[] line = scan.nextLine().split(" - ");
			map.put(line[0], (ArrayList<Double>) Arrays.asList(line[1].split(", ")).stream()
					.map(Double::parseDouble).collect(Collectors.toList()));
	//		num--;
	//	}
		
		System.out.println("Name      |   JAdv|JavaOOP| AdvOOP|Average|");
		for (Map.Entry<String, ArrayList<Double>> student : map.entrySet()) {
			System.out.printf("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|", student.getKey(), student.getValue().get(0), student.getValue().get(1), student
					.getValue().get(2), ((student.getValue().get(0) + student.getValue().get(1) + student.getValue().get(2)) / 3));
			System.out.println();
		}
	}
}

package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p04ParcingLot {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		Set<String> cars = new HashSet<String>();

		while (!line.equals("END")) {
			String[] split = line.split(", ");
			if (split[0].equals("IN"))
				cars.add(split[1]);
			else
				cars.remove(split[1]);
			line = reader.readLine();
		}
		
		if (cars.isEmpty()) {
			System.out.println("Parking Lot is Empty");
		}
		cars.forEach(System.out::println);
	}
}

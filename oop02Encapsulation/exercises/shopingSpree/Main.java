package shopingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Product> products = new LinkedHashMap<>();
		Map<String, Person> people = new LinkedHashMap<>();
		String[] line = reader.readLine().split(";");

		try {
			for (String string : line) {
				people.put(string.split("=")[0], new Person(string.split("=")[0], string.split("=")[1]));
			}

			line = reader.readLine().split(";");
			for (String string : line) {
				products.put(string.split("=")[0], new Product(string.split("=")[0], string.split("=")[1]));
			}

			String line2;

			while ((line2 = reader.readLine()) != null && !line2.equals("END")) {
				people.get(line2.split(" ")[0]).tryToBuy(products.get(line2.split(" ")[1]));				
			}

			people.values().forEach(x -> {
				if (x.getbouthProducts().size() == 0)
					System.out.printf("%s - Nothing bought\n", x.getName());
				else
					System.out.println(x.getName() + " - " + x.getbouthProducts()
							.stream().map(Product::getProducatName)
							.collect(Collectors.joining(", ")));
			});
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}

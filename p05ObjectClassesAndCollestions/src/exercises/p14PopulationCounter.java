package exercises;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class p14PopulationCounter {
	public static class Country {

		String name;
		Map<String, Long> cityInformation;
		long totalPopulation;

		public void addCity(String name, Long population) {
			cityInformation.put(name, population);
			totalPopulation += population;
		}

		public Country(String countryName, String cityName, Long population) {
			name = countryName;
			cityInformation = new LinkedHashMap<String, Long>();
			cityInformation.put(cityName, population);
			totalPopulation = population;
		}

		public long getTotalPopulation() {
			return totalPopulation;
		}

	}

	public static void main(String[] args) {
		Map<String, Country> listOfCountries = new LinkedHashMap<>();

		String countryName = "";
		String city = "";
		long population = 0;
		try (Scanner scan = new Scanner(System.in)) {
			String[] line = scan.nextLine().split("\\|");
			while (!line[0].equals("report")) {
				countryName = line[1];
				city = line[0];
				population = Long.parseLong(line[2]);
				Country current = null;
				if (!listOfCountries.containsKey(countryName)) {
					 current = new Country(countryName, city, population);
					listOfCountries.put(countryName, current);
				} else {
					current = listOfCountries.get(countryName);
					current.addCity(city, population);
				}
				line = scan.nextLine().split("\\|");
			}
		}

		List<Country> countries = listOfCountries.values().stream().sorted(Comparator.comparing(Country::getTotalPopulation).reversed())
				.collect(Collectors.toList());
		for (Country country : countries) {
			System.out.printf("%s (total population: %d)\n", country.name, country.totalPopulation);
			country.cityInformation.entrySet().stream().sorted(Map.Entry.comparingByValue((x, y) -> Long.compare(y, x)))
			.forEachOrdered(x -> System.out.printf("=>%s: %d\n", x.getKey(), x.getValue()));
		}

	}
}

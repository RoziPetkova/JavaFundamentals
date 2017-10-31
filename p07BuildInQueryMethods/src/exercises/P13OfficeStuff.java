package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P13OfficeStuff {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(reader.readLine());
		Map<String, List<Pair<String>>> companies = new TreeMap<>();
		String line = reader.readLine();

		while (count > 0) {
			String company = line.split(" - ")[0].substring(1);
			String amound = line.split(" - ")[1];
			String product = line.split(" - ")[2].substring(0, line.split(" - ")[2].length() - 1);
			Pair<String> obj = new Pair<String>(product, amound);
			if (!companies.containsKey(company)) {
				companies.put(company, new ArrayList<>());
				companies.get(company).add(obj);
			} else {
				companies.get(company).add(new Pair<>(product, amound));
			}
			line = reader.readLine();
			count--;
		}
		
		for (Map.Entry<String, List<Pair<String>>> ent : companies.entrySet()) {
			System.out.print(ent.getKey() + ": ");
			System.out.println(String.join(", ", ent.getValue().stream().map(x -> String.join("-", x.first, x.second)).collect(Collectors.toList())));
		}
//		companies.entrySet()
//			.forEach(a -> System.out.println(a.getKey() + ": " + a.getValue()
//				.forEach(x -> System.out.printf(x.getFirst() + "-" + x.getSecond()))));
	}

	public static class Pair<T> {
		private T first, second;

		public T getFirst() {
			return first;
		}

		public T getSecond() {
			return second;
		}

		public Pair(T first, T second) {
			this.first = first;
			this.second = second;
		}

		@SuppressWarnings("hiding")
		public <T> Pair<T> of(T first, T second) {
			return new Pair<T>(first, second);
		}
//		public static boolean isEqual(Pair<String> firsts) {
//			return first.equals(firsts.first);
//		}
	}
}

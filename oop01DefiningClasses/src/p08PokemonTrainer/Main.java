package p08PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Trainer> trainers = new LinkedHashMap<String, Trainer>();
		String line2;

		while ((line2 = reader.readLine()) != null && !line2.equals("Tournament")) {
			String[] line = line2.split("\\s+");
			trainers.putIfAbsent(line[0], new Trainer(line[0]));

			trainers.get(line[0]).pokemons.add(new Pokemon(line[1], line[2], Integer.valueOf(line[3])));
		}

		String command;
		while ((command = reader.readLine()) != null && !command.equals("End")) {
			String command2 = command;
			for (Trainer trainer : trainers.values()) {
				if (trainer.pokemons.stream().anyMatch(x -> x.elemnet.equals(command2)))
					trainer.addBadget();
				else
					trainer.pokemons.stream().forEach(pok -> pok.health = pok.health - 10);

				trainer.reducePokemons();
			}
		}

		trainers.values().stream()
			.sorted((x, y) -> x.numberOfBadgets > y.numberOfBadgets ? -1 : x.numberOfBadgets < y.numberOfBadgets ? 1 : 0)
			.forEach(x -> System.out.println(x.name + " " + x.numberOfBadgets + " " + x.pokemons.size()));
	}
}

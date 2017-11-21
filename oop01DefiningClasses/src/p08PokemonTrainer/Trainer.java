package p08PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
	
	protected String name;
	protected Integer numberOfBadgets;
	protected List<Pokemon> pokemons = new ArrayList<Pokemon>();
	
	Trainer(String name) {
		this.name = name;
		this.numberOfBadgets = 0;
	}
	protected void reducePokemons(){
		this.pokemons.removeIf(x -> x.health <=0);
	}
	protected void addBadget(){
		this.numberOfBadgets++;
	}
}

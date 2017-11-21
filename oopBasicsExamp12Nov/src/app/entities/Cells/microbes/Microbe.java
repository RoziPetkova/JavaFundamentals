package app.entities.Cells.microbes;

import app.entities.Cell;

public abstract class Microbe extends Cell{
	
	private int virulence; 

	public Microbe(String id, int health, int positionRow, int positionCol, int virulence) {
		super(id, health, positionRow, positionCol);
		if(virulence > 0){
			this.virulence = virulence;}
		else {
			throw new IllegalArgumentException("MicrobeVirulenceinnegative");
		}
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ String.format("\n--------Health: %s | Virulence: %s | Energy: %s", 
							super.getHealth(), this.virulence, super.getEnergy());
	}
	
	@Override
	public Cell metCell(Cell a, Cell b) {
		int counter = 0;
		while (a.getEnergy() > 0 || b.getEnergy() > 0) {
			if (counter % 2 == 0)
				a.setEnergy(a.getEnergy() - b.getEnergy());
			else
				b.setEnergy(b.getEnergy() - a.getEnergy());
			counter++;
		}
		return a.getEnergy() > 0 ? a : b;
	}
}

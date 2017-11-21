package app.entities.Cells.microbes;

public class Bacteria extends Microbe{

	public Bacteria(String id, int health, int positionRow, int positionCol, int virulence) {
		super(id, health, positionRow, positionCol, virulence);
		this.setEnergy((health + virulence) / 3);
	}

}

package app.entities.Cells.microbes;

public class Fungi extends Microbe {

	public Fungi(String id, int health, int positionRow, int positionCol, int virulence) {
		super(id, health, positionRow, positionCol, virulence);
		this.setEnergy((health + virulence) / 4);
	}

}

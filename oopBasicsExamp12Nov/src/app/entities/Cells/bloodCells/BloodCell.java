package app.entities.Cells.bloodCells;

import app.entities.Cell;

public abstract class BloodCell extends Cell {

	public BloodCell(String id, int health, int positionRow, int positionCol) {
		super(id, health, positionRow, positionCol);
	}
	
	@Override
	public Cell metCell(Cell a, Cell b) {
		a.setHealth(a.getHealth() + b.getHealth());
		b.setHealth(0);
		return a;
	}
}

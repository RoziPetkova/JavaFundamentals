package app.entities.Cells.bloodCells;

public class WhiteBloodCell extends BloodCell {

	private int size; // a positive integer that describes the size of the cell.

	public WhiteBloodCell(String id, int health, int positionRow, int positionCol, int size) {
		super(id, health, positionRow, positionCol);
		if(size > 0)
			this.size = size;
		this.setEnergy((health + size) * 2);
	}
	
	
	@Override
	public String toString() {

		return super.toString() 
				+ String.format("\n--------Health: %s | Size: %s | Energy: %s", 
							super.getHealth(), this.size, super.getEnergy());
	}
}

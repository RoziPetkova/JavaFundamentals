package app.entities.Cells.bloodCells;

public class RedBloodCell extends BloodCell{
	
	private int velocity; // a positive integer that describes the size of the cell.

	public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
		super(id, health, positionRow, positionCol);
		if(velocity > 0)
			this.velocity = velocity;
		this.setEnergy(health + velocity);
	}
	
	@Override
	public String toString() {

		return super.toString() 
				+ String.format("\n--------Health: %s | Velocity: %s | Energy: %s", 
							super.getHealth(), this.velocity, super.getEnergy());
	}
	
}

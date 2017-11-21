package app.entities;

public abstract class Cell {

	private String id;
	private int health; 
	private int positionRow; 
	private int positionCol; 
	private int energy;


	public Cell(String id, int health, int positionRow, int positionCol) {
		if (health > 0 && positionRow > 0 && positionCol > 0) {
			this.id = id;
			this.health = health;
			this.positionRow = positionRow;
			this.positionCol = positionCol;	
			}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setPositionRow(int positionRow) {
		this.positionRow = positionRow;
	}

	public void setPositionCol(int positionCol) {
		this.positionCol = positionCol;
	}

	public int getPositionRow() {
		return positionRow;
	}

	public int getPositionCol() {
		return positionCol;
	}

	public abstract Cell metCell(Cell a, Cell b);
	
	public String getID(){
		return this.id;
	}
	public int getHealth() {
		return health;
	}

	public int getEnergy() {
		return energy;
	}

	@Override
	public String toString() {
		return String.format("\n------Cell %s [%s,%s]", this.id, this.positionRow, this.positionCol);
	}
}

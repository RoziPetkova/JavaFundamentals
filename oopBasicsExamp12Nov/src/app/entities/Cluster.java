package app.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cluster {

	private String id; 
	private int rows;
	private List<Cell> cells;

	public Cluster(String id, int rows, int cols) {
		if (rows > 0 && cols > 0) 
			this.id = id;
			this.rows = rows;
			this.cols = cols;
			this.cells = new ArrayList<>();	
	}

	public String getId() {
		return this.id;
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}

	private int cols;

	public List<Cell> getCells() {
		return Collections.unmodifiableList(this.cells);
	}

	public void addCell( Cell theCell){
		cells.add(theCell);
	}
	
	public boolean cellIsInsice(Cell theCell) {
		if(theCell.getPositionCol() > this.cols || theCell.getPositionRow() > this.rows)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		String cells = "";
		for (Cell cell : this.cells) {
			cells += cell.toString();
		}
		return String.format("\n----Cluster %s", this.id) + cells;
	}
}

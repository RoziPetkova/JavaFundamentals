package app.factories;

import app.entities.Cell;
import app.entities.Cells.bloodCells.RedBloodCell;
import app.entities.Cells.bloodCells.WhiteBloodCell;
import app.entities.Cells.microbes.Bacteria;
import app.entities.Cells.microbes.Fungi;
import app.entities.Cells.microbes.Virus;

public final class CellFactory {

	public static Cell createCell(String cellType, String cellId, int health, int positionRow, int positionCol, int additionalProperty) {
		try {
			switch (cellType) {
			case "WhiteBloodCell":
				return new WhiteBloodCell(cellId, health, positionRow, positionCol, additionalProperty);
			case "RedBloodCell":
				return new RedBloodCell(cellId, health, positionRow, positionCol, additionalProperty);
			case "Virus":
				return new Virus(cellId, health, positionRow, positionCol, additionalProperty);
			case "Bacteria":
				return new Bacteria(cellId, health, positionRow, positionCol, additionalProperty);
			case "Fungi":
				return new Fungi(cellId, health, positionRow, positionCol, additionalProperty);
			default:
				return null;
			}
		} catch (IllegalArgumentException e) {
			return null;
		}

	}
}

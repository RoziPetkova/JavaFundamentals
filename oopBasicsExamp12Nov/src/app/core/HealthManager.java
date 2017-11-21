package app.core;

import java.util.HashMap;
import java.util.Map;
import app.entities.Cell;
import app.entities.Organism;
import app.factories.CellFactory;


public class HealthManager {
	private  Map<String, Organism> allOrganisms;
	

	public HealthManager (){
		allOrganisms = new HashMap<>();	
	}
	
	public	String checkCondition(String organismName){
		if (allOrganisms.containsKey(organismName))
			return allOrganisms.get(organismName).toString();
		return null;
	}
	
	public	String createOrganism(String name) {
		if (!allOrganisms.containsKey(name)){
			allOrganisms.put(name, new Organism(name));
			return String.format("Created organism %s", name);
			}
		return String.format("Organism %s already exists", name);
	}
	
	
	public	String addCluster(String organismName, String id, int rows, int cols){
		if (allOrganisms.containsKey(organismName) && !(allOrganisms.get(organismName).getClusters().containsKey(id))) {
			allOrganisms.get(organismName).addCluster(id, rows, cols);
			return String.format("Organism %s: Created cluster %s", organismName, id);
		}
		return null;
	}
	
	public	String addCell(String organismName, String clusterId, String cellType, String cellId, int health, int positionRow, int positionCol, int additionalProperty){
		Cell theCell = CellFactory.createCell(cellType, cellId, health, positionRow, positionCol, additionalProperty);
		
		if (allOrganisms.containsKey(organismName) 
				&& allOrganisms.get(organismName).getClusters().containsKey(clusterId)
				&& allOrganisms.get(organismName).getClusters().get(clusterId).cellIsInsice(theCell)) {
			allOrganisms.get(organismName).addCelltoCluster(clusterId, theCell);
			return String.format("Organism %s: Created cell %s in cluster <cluster id>", organismName, theCell.getID(), clusterId);
		}
		return null;
	}
	
	public String activateCluster(String organismName) {
		return String.format("Organism %s: Activated cluster %s. Cells left: 1", organismName, allOrganisms.get(organismName).clusrersStringIDs.pop());
	}
}


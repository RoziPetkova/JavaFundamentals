package app.entities;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;


public class Organism {

	private String name;
	private Map<String, Cluster> clusters;
	public Deque<String> clusrersStringIDs;
	

	public Organism(String name) {
		this.name = name;
		this.clusters = new HashMap<>();
		clusrersStringIDs = new ArrayDeque<>();
	}

	public String getName() {
		return name;
	}

	public Map<String, Cluster> getClusters() {
		return this.clusters;
	}

	public void addCluster(String id, int rows, int cols) {
		if(!clusters.containsKey(id)){
			clusrersStringIDs.push(id);
		}	
		this.clusters.putIfAbsent(id, new Cluster(id, rows, cols));
	}

	
	public void addCelltoCluster(String clusterId, Cell theCell){
		clusters.get(clusterId).addCell(theCell);
	}

	@Override
	public String toString() {
		String clusterStr = "";
		for (Cluster cluster : clusters.values()) {
			clusterStr += cluster.toString();
		}
		return String.format("Organism - %s" + "\n--Clusters: %s" + "\n--Cells: %s", this.name, this.clusters.size(),
				this.clusters.values().stream().mapToInt(cluster -> cluster.getCells().size()).sum()) + clusterStr;
	}
}
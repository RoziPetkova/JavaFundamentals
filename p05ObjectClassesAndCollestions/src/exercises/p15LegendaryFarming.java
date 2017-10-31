package exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//Shards, Fragments and Motes
public class p15LegendaryFarming {
	public static void main(String[] args) {
		String word = "";
		int curr = 0;
		Map<String, Integer> mapche = new TreeMap<String, Integer>();
		Map<String, Integer> mapche2 = new TreeMap<String, Integer>();
		mapche.put("shards", 0);
		mapche.put("fragments", 0);
		mapche.put("motes", 0);	
		boolean ownItem = false;

		try (Scanner scan = new Scanner(System.in);) {
			curr = Integer.parseInt(scan.next());
			word = scan.next().toLowerCase();
			while (!ownItem) {
				if (mapche.containsKey(word)) {
					mapche.put(word, mapche.get(word) + curr) ;
					
				}else {
					mapche2.put(word, mapche.get(word) + curr) ;
				}
				curr = Integer.parseInt(scan.next());
				word = scan.next();
			}
		}
	}
}

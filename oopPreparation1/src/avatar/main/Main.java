package avatar.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line;


		while ((line = reader.readLine().split("\\s+")) != null && !(line[0].equals("Quit"))) {
			switch (line[0]) {
			case "Bender":
				Factory.addBenderToNation(line[1], line[2], Integer.parseInt(line[3]), Double.parseDouble(line[4]));
				break;
			case "Monument":
				Factory.addMonumentToNation(line[1], line[2], Integer.parseInt(line[3]));
				break;
			case "Status":
				Controller.printNation(line[1]);
				break;
			case "War":
				Controller.War(line[1]);
				break;
			}
		}
		
		Controller.printWar();
	}
}

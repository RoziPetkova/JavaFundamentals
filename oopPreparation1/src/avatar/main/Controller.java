package avatar.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Controller {
	static Nation airNation = new Nation(new LinkedList<>(), new LinkedList<>());
	static Nation waterNation = new Nation(new LinkedList<>(), new LinkedList<>());
	static Nation fireNation = new Nation(new LinkedList<>(), new LinkedList<>());
	static Nation earthNation = new Nation(new LinkedList<>(), new LinkedList<>());
	static List<Nation> nations = new ArrayList<>(Arrays.asList(airNation, earthNation, fireNation, waterNation));
	static List<String> wars = new ArrayList<>();

	public static Nation getAirNation() {
		return airNation;
	}

	public static Nation getWaterNation() {
		return waterNation;
	}

	public static Nation getFireNation() {
		return fireNation;
	}

	public static Nation getEarthNation() {
		return earthNation;
	}
	
	public static void printNation(String nation) {
		switch (nation) {
		case "Air": 
			System.out.print("Air Nation");
			airNation.printMe(); break;
		case "Water":
			System.out.print("Water Nation");
			waterNation.printMe(); break;
		case "Fire":
			System.out.print("Fire Nation");
			fireNation.printMe(); break;
		case "Earth":
			System.out.print("Earth Nation");
			earthNation.printMe(); break;
		}
	}

	public static void War(String line) {
		wars.add(line);
		Collections.sort(nations, (x, y) -> x.getNationPower() < y.getNationPower() ? 1 : -1);
		nations.stream().skip(1).forEach(x -> {
			x.removeBenders();
			x.removeMonuments();
		});
	}
	
	public static void printWar(){
		for (int i = 0; i < wars.size(); i++) {
			System.out.printf("War %d issued by %s\n", i + 1, wars.get(i));
		}
	}
}

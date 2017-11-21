package avatar.main;

import avatar.bender.AirBender;
import avatar.bender.EarthBender;
import avatar.bender.FireBender;
import avatar.bender.WaterBender;
import avatar.monuments.AirMonument;
import avatar.monuments.EarthMonument;
import avatar.monuments.FireMonument;
import avatar.monuments.WaterMonument;

public class Factory {
	public static void addBenderToNation(String type, String name, int power, double secondaryParameter) {
		switch (type) {
		case "Air":
			Controller.getAirNation().addBender(new AirBender(name, power, secondaryParameter)); break;
		case "Water":
			Controller.getWaterNation().addBender(new WaterBender(name, power, secondaryParameter)); break;
		case "Fire":
			Controller.getFireNation().addBender(new FireBender(name, power, secondaryParameter)); break;
		case "Earth":
			Controller.getEarthNation().addBender(new EarthBender(name, power, secondaryParameter)); break;
		}
	}

	public static void addMonumentToNation(String type, String name, int affinity) {
		switch (type) {
		case "Air":
			Controller.getAirNation().setMonuments(new AirMonument(name, affinity)); break;
		case "Water":
			Controller.getWaterNation().setMonuments(new WaterMonument(name,affinity)); break;
		case "Fire":
			Controller.getFireNation().setMonuments(new FireMonument(name, affinity)); break;
		case "Earth":
			Controller.getEarthNation().setMonuments(new EarthMonument(name, affinity)); break;
		}
	}
}

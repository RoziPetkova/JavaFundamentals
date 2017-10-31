package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class P05SpeedRacing {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.valueOf(reader.readLine());
		Map<String, Car> cars = new LinkedHashMap<String, Car>();
		String[] line = null;
		
	// “<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType>
	// <Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure>
	// <Tire3Age>
		
		while (count > 0) {
			line = reader.readLine().split("\\s+");
			cars.put(line[0], new Car(line[0], new Engine(Integer.valueOf(line[1]), Integer.valueOf(line[2])),
					new Cargo(Integer.valueOf(line[3]), line[4]), new Tire(Double.parseDouble(line[5]), Integer.valueOf(line[6])),
					 new Tire(Double.parseDouble(line[7]), Integer.valueOf(line[8])),
					 new Tire(Double.parseDouble(line[9]), Integer.valueOf(line[10])),
					 new Tire(Double.parseDouble(line[11]), Integer.valueOf(line[12]))));
			count--;
		}

		String command = reader.readLine();
		
		if(command.equals("flamable"))
			cars.values().stream().filter(x -> x.cargo.type.equalsIgnoreCase("Flamable") && x.engine.power > 250)
					.forEach(x -> System.out.println(x.model));
		else
			cars.values().stream().filter(x -> x.cargo.type.equalsIgnoreCase("Fragile") && x.tires.stream().anyMatch(y -> y.tirePressure < 1))
					.forEach(x -> System.out.println(x.model));
	}
}

class Car {

	String model;
	Double fuelAmount;
	Double fuelPerKm;
	Double distanceTraveled = 0.0;
	Engine engine;
	Cargo cargo;	
	Tire tire1;
	Tire tire2;
	Tire tire3;
	Tire tire4;
	List<Tire> tires = new ArrayList<>();

	Car(String model, Double fuelAmount, Double fuelPerKm) {
		this.model = model;
		this.fuelAmount = fuelAmount;
		this.fuelPerKm = fuelPerKm;
	}

	Car(String model, Engine engine, Cargo cargo, Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
		super();
		this.model = model;
		this.engine = engine;
		this.cargo = cargo;
		this.tire1 = tire1;
		this.tire2 = tire2;
		this.tire3 = tire3;
		this.tire4 = tire4;
		tires.addAll(Arrays.asList(tire1, tire2, tire3, tire4));
	}

	void drive(Double kilometers) {
		if (kilometers * this.fuelPerKm > this.fuelAmount)
			throw new IllegalStateException("Insufficient fuel for the drive");
		this.distanceTraveled += kilometers;
		this.fuelAmount -= kilometers * this.fuelPerKm;
	}
}

class Engine {
	int speed;
	int power;

	Engine(int speed, int power) {
		this.speed = speed;
		this.power = power;
	}

}

class Cargo {
	int weight;
	String type;

	Cargo(int weight, String type) {
		this.weight = weight;
		this.type = type;
	}
}

class Tire {
	double tirePressure;
	int tireAge;

	Tire(double tirePressure, int tireAge) {
		super();
		this.tirePressure = tirePressure;
		this.tireAge = tireAge;
	}
}
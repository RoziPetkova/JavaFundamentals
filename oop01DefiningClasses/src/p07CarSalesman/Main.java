package p07CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line;
		List<Engine> engines = new ArrayList<Engine>();
		List<Car> cars = new ArrayList<Car>();
		int count = Integer.valueOf(reader.readLine());
		
		while (count > 0) {
			line = reader.readLine().split("\\s+");
			if(line.length == 2)
				engines.add(new Engine(line[0], Integer.valueOf(line[1])));
			else if( line.length == 3)
				engines.add(new Engine(line[0], Integer.valueOf(line[1]), line[2]));
			else 
				engines.add(new Engine(line[0], Integer.valueOf(line[1]),  Integer.valueOf(line[2]), line[3]));		
			
			count --;
		}
		
		count = Integer.valueOf(reader.readLine());
		
		while (count > 0) {
			String[] line1 = reader.readLine().split("\\s+");
			Engine engine = engines.stream().filter(eng -> eng.model.equals(line1[1])).findAny().get();
			if(line1.length == 2)
				cars.add(new Car(line1[0], engine));
			else if(line1.length == 3)
				cars.add(new Car(line1[0], engine, line1[2]));
			else 
				cars.add(new Car(line1[0], engine,  Integer.valueOf(line1[2]), line1[3]));		
			
			count --;
		}
		
		cars.forEach(car -> {
			System.out.println(car.model +":" );
			System.out.println("  " + car.engine.model + ":");
			System.out.println("    Power: " + car.engine.power );
			System.out.println("    Displacement: " + (car.engine.displacement == null ? "n/a" : car.engine.displacement));
			System.out.println("    Efficiency: " + (car.engine.efficiensy == null ? "n/a" : car.engine.efficiensy));
			System.out.println("  Weight: " + (car.weight == null ? "n/a" : car.weight));
			System.out.println("  Color: " + (car.color == null ? "n/a" : car.color));
			
		});
		
	}

}

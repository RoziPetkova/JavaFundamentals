package p01Vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = reader.readLine().split("\\s+");
		DecimalFormat format = new DecimalFormat("#.##");
		
		Vehicle car = new Car(Double.parseDouble(line[1]), Double.parseDouble(line[2]));
		line = reader.readLine().split("\\s+");
		Vehicle truck = new Truck(Double.parseDouble(line[1]), Double.parseDouble(line[2]));

		for (int i = Integer.parseInt(reader.readLine()); i > 0; i--) {
			line = reader.readLine().split("\\s+");
			Vehicle theVehicle = line[1].equals("Car") ? car : truck;

			try {
				if (line[0].equals("Drive")) {
					theVehicle.dive(Double.parseDouble(line[2]));
					System.out.printf("%s travelled %s km\n", theVehicle.getClass().getSimpleName(), format.format(Double.parseDouble(line[2])));
				} else
					theVehicle.refuel(Double.parseDouble(line[2]));
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.printf("Car: %.2f\n", car.getFuelQuantity());
		System.out.printf("Truck: %.2f\n", truck.getFuelQuantity());
	}
}

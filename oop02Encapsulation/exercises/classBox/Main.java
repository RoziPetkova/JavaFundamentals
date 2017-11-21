package classBox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Double length = Double.valueOf(reader.readLine());
		Double width = Double.valueOf(reader.readLine());
		Double height = Double.valueOf(reader.readLine());
		
		
		try {
			Box box = new Box(length, width, height);
			System.out.printf("Surface Area - %.2f\n",  box.surfaceArea());
			System.out.printf("Lateral Surface Area - %.2f\n", box.lateralSurfaceArea());
			System.out.printf("Volume - %.2f\n", box.Volume());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}

package animalFarmProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			Chiken chiken = new Chiken(reader.readLine(), Integer.valueOf(reader.readLine()));
			System.out.printf("Chicken %s (age %s) can produce %.0f eggs per day.", 
					chiken.getName(), chiken.getAge(), chiken.productPerDay());
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}

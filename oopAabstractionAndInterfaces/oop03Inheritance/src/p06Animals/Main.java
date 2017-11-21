package p06Animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String animalStr;
		String[] animalInfo;
		Animal animal = null;

		while ((animalStr = reader.readLine()) != null && !(animalStr.equals("Beast!"))) {
			animalInfo = reader.readLine().split("\\s+");
			try {
				if (animalInfo.length != 3)
					System.out.println("Invalid input!");
					
				switch (animalStr) {
				case "Cat":
					animal = new Cat(animalInfo[0], animalInfo[1], animalInfo[2]);
					break;
				case "Dog":
					animal = new Dog(animalInfo[0], animalInfo[1], animalInfo[2]);
					break;
				case "Frog":
					animal = new Frog(animalInfo[0], animalInfo[1], animalInfo[2]);
					break;
				case "Kitten":
					animal = new Kitten(animalInfo[0], animalInfo[1], animalInfo[2]);
					break;
				case "Tomcat":
					animal = new Tomcat(animalInfo[0], animalInfo[1], animalInfo[2]);
					break;
				default:
					System.out.println("Invalid input!");
					break;
				}

				if (animal != null)
					System.out.println(animal.toString());
			
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}

		}
	}
}

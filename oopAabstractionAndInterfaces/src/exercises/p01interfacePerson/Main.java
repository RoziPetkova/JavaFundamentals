package exercises.p01interfacePerson;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IllegalClassFormatException {
		String ferrariName = Ferrari.class.getSimpleName();
		String carInterface = Car.class.getSimpleName();
		boolean isCreated = Car.class.isInterface();
		if (!isCreated) {
			throw new IllegalClassFormatException("No interface created!");
		}
		
		Iterable<String>hah ;
		Scanner scan = new Scanner(System.in);
		Car ferrari = new Ferrari(scan.nextLine());
		System.out.println(ferrari.toString());
	}
}

package mordorsCruelPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] foods = reader.readLine().split("\\s+");
		Gandalf gani = new Gandalf();

		for (String string : foods) {
			gani.controlPoints(string);
		}

		System.out.println(gani.getPoints());
		System.out.println(gani.getMood());
	}

}

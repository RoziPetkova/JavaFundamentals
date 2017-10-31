package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p09MatchHullName {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();
		
		while (! line.equals("end")) {
			if(line.matches("^[A-Z]{1}[a-z]+ [A-Z][a-z]+"))
				// for next exercise ("^\\+359([ -])2\\1\\d{3}\\1\\d{4}$" 
				System.out.println(line);
			
			line = reader.readLine();
		}
		
	}
}

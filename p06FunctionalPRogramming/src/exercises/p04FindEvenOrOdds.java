package exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;


public class p04FindEvenOrOdds {
	public static void main(String[] args) {
		Predicate<Integer> findOdd = x -> x % 2 == 1 || x % 2 == -1 ;
		Predicate<Integer> findEven = x -> x % 2 == 0;
		int lowerBound;
		int upperBound;
		String command = "";
		
		try(Scanner scan = new Scanner(System.in)){
			lowerBound = Integer.parseInt(scan.next());
			upperBound = Integer.parseInt(scan.next());
			command = scan.next();
		}
		
		Collection<Integer> numbers = new ArrayList<Integer>();
		for (int i = lowerBound; i <= upperBound; i++) {
			numbers.add(i);
		}
		
		if(command.equals("odd"))
			numbers.stream().filter(x -> findOdd.test(x)).forEach(x -> System.out.printf( x + " "));
		else 
			numbers.stream().filter(x -> findEven.test(x)).forEach(x -> System.out.printf( x + " "));
	}
}

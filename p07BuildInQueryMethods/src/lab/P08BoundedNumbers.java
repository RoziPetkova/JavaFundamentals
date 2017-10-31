package lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class P08BoundedNumbers {
	public static void main(String[] args) {
		
		IntStream numbers = null;
	
		 try(Scanner scan = new Scanner(System.in))
		{
			final Integer lowerBound = scan.nextInt();
			final Integer upperBound = scan.nextInt();
			scan.nextLine();
			numbers = Arrays.asList(scan.nextLine().split("\\s+")).stream().mapToInt(Integer::parseInt); 
			numbers.filter(x -> (x >= lowerBound && x<= upperBound) || (x <= lowerBound && x>= upperBound) ).forEach( x-> System.out.print(x +" "));
		}
		 
		
	}
}

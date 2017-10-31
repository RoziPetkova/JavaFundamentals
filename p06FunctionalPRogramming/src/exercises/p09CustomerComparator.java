package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p09CustomerComparator {
	public static void main(String[] args) {
		
		List<Integer> collection = new ArrayList<Integer>();
		try (Scanner scan = new Scanner(System.in)) {
			collection = Arrays.asList(scan.nextLine().split("\\s+"))
								.stream()
								.map(x -> Integer.parseInt(x))
								.collect(Collectors.toList());
		}
		
		Collections.sort(collection, new Comparator<Integer>(){
			 @Override
	            public int compare(Integer int1, Integer int2) {
	              
	                int mod1 = Math.abs(int1%2);
	                int mod2 = Math.abs(int2%2);

	                return (mod1 == mod2) ? int1.compareTo(int2) : (mod1 > mod2) ? 1 : -1;
//	                return ((mod1 == mod2) ? ((mod1 == 0) ? int1.compareTo(int2) 
//	                		: int2.compareTo(int1)) 
//	                		: ((mod1 < mod2) ? -1 
//	                				: 1));
	            }
		});
		
		collection.forEach(x -> System.out.print(x +" " ));

	}
}

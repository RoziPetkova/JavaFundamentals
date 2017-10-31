package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import java.util.Scanner;
import java.util.function.Consumer;

public class p01ComsumerPrint {
public static void main(String[] args) {
	Collection<String> collection = new ArrayList<String>();
	try(Scanner scan = new Scanner(System.in)){
		collection =  Arrays.asList(scan.nextLine().split("\\s+"));
	}
//	Consumer<Collection<String>> printCollection = x -> x.forEach(System.out::println);
//	printCollection.accept(collection);
	Consumer<String> printEach = x -> System.out.printf("Sir " +x + "\n");
	collection.forEach(printEach);
	
	
}
}

package p02Abstraction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02EncryptSortandPrintArray {
	private static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		String[] names = new String[count];
		for (int i = 0; i < names.length; i++) {
			names[i] = scanner.nextLine();
		}
		
		List<Integer> numbers = new ArrayList();
		for (String name : names) {
			numbers.add((CaclucateName(name)));
		}
		
		numbers.sort((p1, p2) -> p1.compareTo(p2));
		
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
	}
	public static int CaclucateName(String name) {
		String list = "AOEIaouei";
		
		int sum = 0;
		List<Character> list2 = list.toString().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		for (int i = 0; i < name.length(); i++) {
			if (list2.contains(name.charAt(i))) {
				sum = sum + (int)(name.charAt(i)) * (int) name.length();
			} else {
				sum = sum + (int) (name.charAt(i)) / (int) name.length();
			}
		}
		return sum;
	}
}

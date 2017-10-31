package exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class p01BasicStackOperations {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		int elenetsToPop = scan.nextInt();
		int searchFor = scan.nextInt();
		Deque<Integer> stack = new ArrayDeque<Integer>();

//		p01 Basic Stack Operationa
		 while (numberOfElements > 0) {
		 stack.push(scan.nextInt());
		 numberOfElements--;
		 }
		
		 while (elenetsToPop > 0) {
		 stack.pop();
		 elenetsToPop--;
		 }
		
//		p03 Basic Queue Operations
//		while (numberOfElements > 0) {
//			stack.add(scan.nextInt());
//			numberOfElements--;
//		}
//
//		while (elenetsToPop > 0) {
//			stack.poll();
//			elenetsToPop--;
//		}

		int minvalue = Integer.MAX_VALUE;
		boolean match = false;

		for (Integer integer : stack) {
			if (integer == searchFor)
				match = true;
			if (integer < minvalue)
				minvalue = integer;
		}

		if (match)
			System.out.println("true");
		else if (stack.isEmpty()) {
			System.out.println(0);
		}
		else
			System.out.println(minvalue);
	}
}

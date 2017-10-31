package lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class p02HotPotato {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> kids = Arrays.asList(scan.nextLine().split(" "));
		Integer rotations = Integer.parseInt(scan.nextLine());
		Deque<String> queue = new ArrayDeque<>();

		for (String name : kids) {
			queue.offer(name);
		}

		// Exercise 02

		// while (queue.size() > 1) {
		// for (int i = 1; i < rotations; i++)
		// queue.offer(queue.poll());
		// System.out.println("Removed " + queue.poll());
		// }

		// Exercise p03 Math Potato

		int cycle = 1;
		while (queue.size() > 1) {
			for (int i = 1; i < rotations; i++) 
				queue.offer(queue.poll());
			
			if ((isPrime(cycle))) {
				System.out.println("Prime " + queue.peek());
			} else {
				System.out.println("Removed " + queue.poll());
			}
			cycle++;
		}

		System.out.println("Last is " + queue.poll());
	}

	public static boolean isPrime(int n) {
		if (n <=1) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}

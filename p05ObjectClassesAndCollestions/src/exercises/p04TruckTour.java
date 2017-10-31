package exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class p04TruckTour {
	public static class GasStation {
		public int gas;
		public int distance;
		public int index;
		
		public GasStation(int gas, int kilometers, int index){
			this.gas = gas;
			this.distance = kilometers;
			this.index =  index;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		Deque<GasStation> queue = new ArrayDeque<GasStation>();
		int gasInTruck = 0;

		for (int i = 0; i < n; i++) {
			String[] line = scan.nextLine().split(" ");
			queue.add(new GasStation(Integer.parseInt(line[0]), Integer.parseInt(line[1]), i));
		}

		for (int i = 0; i < n; i++) {
			if (queue.peek().gas > queue.peek().distance) {
				if (!tryToComplete(queue.peek(), queue, gasInTruck)) {
					gasInTruck = gasInTruck + queue.peek().gas - queue.peek().distance;
					queue.offer(queue.poll());
				} else
					System.out.println(i);
				break;
			}else
				queue.offer(queue.poll());
		}
	}

	private static Boolean tryToComplete(GasStation gasStation, Deque<GasStation> stations, int gasInTruck) {
		for (int i = 0; i < stations.size(); i++) {
			gasInTruck = gasInTruck + (gasStation.gas - gasStation.distance);
			if (gasInTruck <= 0)
				return false;
		}
		return true;
	}
}

package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class p06OverlappingIntervals {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int numOfIntevals = Integer.parseInt(read.readLine());
		List<String> intervals = new LinkedList<String>();

		for (int i = 0; i < numOfIntevals; i++) {
			intervals.add(read.readLine());
		}
		
		//System.out.println(intervals.toString());
		boolean overlapps = false;
		for (int i = 0; i < intervals.size() - 1; i++) {
			if (areOverlapped(intervals.get(i), intervals.get(i + 1))) 
				overlapps = true;
			break;
		}
		
		System.out.println(overlapps);
	}

	public static Boolean areOverlapped(String fisrStr, String secondStr) {
		String[] fromFirst = fisrStr.split(",");
		String[] fromSecond = secondStr.split(",");
		if (Integer.parseInt(fromFirst[1]) > Integer.parseInt(fromSecond[0]))
			return true;
		return false;
	}
}

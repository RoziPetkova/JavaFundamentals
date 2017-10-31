package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class p01ReverseArray {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = Arrays.asList(reader.readLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		
		//List<Integer> newList=reverseRec(list);
		//System.out.println(newList);
		reverseRec(list);
	}

	private static void reverseRec(List<Integer> list) {
		//List<Integer> toReturn = new ArrayList<Integer>();
		
		if (list.size()== 1) {
			//toReturn.add(list.get(0));
			System.out.print(list.get(0)+ " ");
		}else {
			//toReturn.addAll(reverseRec(list.subList(1, list.size())));
			//toReturn.add(list.get(0));
			reverseRec(list.subList(1, list.size()));
			 System.out.print(list.get(0) + " ");
		}
		
	}

}

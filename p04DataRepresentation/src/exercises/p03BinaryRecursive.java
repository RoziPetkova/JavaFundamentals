package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.stream.events.EndDocument;

public class p03BinaryRecursive {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = Arrays.asList(reader.readLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		int key = Integer.parseInt(reader.readLine());
		
		System.out.println(binarySearch(list, key, 0, list.size() -1));

	}
	public static int  binarySearch(List<Integer> list,  int key, int startInd, int lastInd) {
		if (startInd <= lastInd) {
			int mid = (lastInd  + startInd) / 2;
			return list.get(mid) == key ? mid : list.get(mid) < key ? binarySearch(list, key, mid + 1, lastInd) : binarySearch(list, key, startInd, lastInd - 1);
//			if (list.get(mid) == key) {
//				return mid;
//			}else if (list.get(mid) < key) {
//				startInd = mid + 1;
//				binarySearch(list, key, startInd, lastInd);
//			}else {
//			  lastInd = mid - 1;
//				binarySearch(list, key, startInd, lastInd);
//			}
		}
		return - 1;
	}

}

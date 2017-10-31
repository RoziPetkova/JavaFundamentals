package Lab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class p02Searching {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		int toRead;
		List<Integer> list = new ArrayList<>();
		int toSearch = 0;

		while((toRead = System.in.read()) != -1) {
			if((char) toRead == ' ')
				continue;
			if((char) toRead != '\n')
				list.add(Integer.parseInt("" + (char)toRead));
			else 
				toSearch = Integer.parseInt("" + (char)toRead);
		}
			
		
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		List<Integer> list = Arrays.asList(reader.readLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());

		int someInt = binarySearch(list, toSearch);
		
		System.out.println(someInt);
	}

	public static int binarySearch(List<Integer> arr, int num) {
		int startIndex = 0;
		int endIndex = arr.size() - 1;
		int middleIndex = 0;

		while (startIndex <= endIndex) {
			middleIndex = (startIndex + endIndex) / 2;
			if (arr.get(middleIndex) == num) {
				return middleIndex;
			}
			else if (arr.get(middleIndex) > num) {
				endIndex = middleIndex -1;
			}else {
				startIndex = middleIndex + 1;
			}	
		}
		return -1;

	}

}

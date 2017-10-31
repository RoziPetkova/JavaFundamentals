package Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class p01Soting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Integer[] arr = null; try (Scanner scan = new Scanner(System.in)) {
		 * arr =
		 * Stream.of(scan.nextLine().split(" ")).map(Integer::parseInt).toArray
		 * (Integer[]::new); }
		 * 
		 * bubbleSort(arr); for (int j = 0; j < arr.length; j++) {
		 * System.out.print(arr[j] + " "); }
		 */

		Integer[] arr1 = { 1, 5, 3,2,10,4, 54, 84, 72, 6, 8, 9 };
		Integer[] arr2 = { 2,};
		Integer[] arr3 = { 4, };

		System.out.println(Arrays.toString(mergeSort(arr1)));
	}

	public static void bubbleSort(Integer[] arr) {
		boolean swaps = false;
		do {
			swaps = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int currNum = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = currNum;
					swaps = true;
				}
			}
		} while (swaps);
	}

	public static void selectionSort(Integer[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					minIndex = j;
					int currentNum = arr[i];
					arr[i] = arr[j];
					arr[j] = currentNum;
				}
			}
		}
	}

	public static Integer[] merge(Integer[] arr1, Integer[] arr2) {

		Integer[] newArr = new Integer[arr1.length + arr2.length];
		int indexarr1 = 0;
		int indexarr2 = 0;
		int counter = 0;

		while (counter < newArr.length ) {
			if (indexarr1 < arr1.length && indexarr2 < arr2.length) {
				newArr[counter] = arr1[indexarr1] < arr2[indexarr2] ? arr1[indexarr1] : arr2[indexarr2];
				if (arr1[indexarr1] < arr2[indexarr2]) {
					indexarr1++;
				} else {
					indexarr2++;
				}
				counter++;
			} else {
				for (int i = counter; i < newArr.length; i++) {
					newArr[i] = indexarr1 > (arr1.length - 1) ? arr2[indexarr2] : arr1[indexarr1];
					if (newArr[i] == arr1[arr1.length - 1]) {
						indexarr1++;
					} else {
						indexarr2++;
					}
					counter++;
				}
			}
		}
		return newArr;
	}

	public static Pair<Integer[]> divide(Integer[] array) {
		Integer[] arr1 = Arrays.copyOfRange(array, 0, array.length / 2);
		Integer[] arr2 = Arrays.copyOfRange(array, array.length / 2, array.length);

		return Pair.of(arr1, arr2);
	}

	public static Integer[] mergeSort(Integer[] array) {
		if (array.length == 1)
			return array;
		
		return merge(
				mergeSort(divide(array).getFirst()),
				mergeSort(divide(array).getSecond())
			);
	}

}
	
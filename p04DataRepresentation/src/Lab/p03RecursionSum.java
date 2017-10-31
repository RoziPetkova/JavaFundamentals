package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class p03RecursionSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		List<Integer> list = Arrays.asList(reader.readLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
		List<Integer> list = new Random().ints(100000).mapToObj(Integer::new).collect(Collectors.toList());
		
		//long a = System.currentTimeMillis();
		//System.out.println(sumRecursion(list));
		//System.out.println(System.currentTimeMillis() - a);
		//System.out.println(mul(2, 2));
		//long b = System.currentTimeMillis();
		//System.out.println(sumRecursionIndex(list, list.size() - 1));
		//System.out.println(System.currentTimeMillis() - b);
		
		System.out.println(pow(10,2));
		System.out.println(sum(3,4));
	}

	public static int pow(int x, int y) {
		return y == 1 ? x : mul(x, pow(x, y - 1));
	}
	
	public static int mul(int x, int index) {
		return index == 1 ? x : sum(x, mul(x, index - 1));
	}
	
	public static int sum(int x, int y) {
		return y == 0 ? x : 1 + sum(x, y-1);
	}
	
	public static int  sumRecursion(List<Integer> fuck) {
		return (fuck.size()== 1) ? 
					fuck.get(0) :
					fuck.get(fuck.size()-1) + sumRecursion(fuck.subList(0, fuck.size()-1));
	}

	public static int sumRecursionIndex(List<Integer> fuck, int index) {
		return (index == 0) ? 
					fuck.get(0) :
					fuck.get(index) + sumRecursionIndex(fuck, index - 1);
	}
} 

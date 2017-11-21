package p05;


import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		RandomArrayList list = new RandomArrayList();
		list.addAll(Arrays.asList("a", 3, "sdfsd", "ksksk"));
		System.out.println(list.getRandomElement());
		
	}
}

package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p03CountUppsercaseWords {
	public static void main(String[] args) throws IOException {
		String[] words = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		Predicate<String> someName = x -> likeAPredicate(x);
		
		List<String> list = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		for (String string : words) {
			if (someName.test(string)) {
				list.add(string);
			}
		}

		System.out.println(list.size());
		Deque<String> myDeque = new ArrayDeque<String>();
		list.forEach(System.out::println);
		list.stream().collect(Collectors.toCollection(() -> myDeque));
	}
	
	public static void myTest(ArrayList<String> myList)  {
		
	}
//	public static boolean containsStartsWithStr(List<String> list, String str, Predicate<String> pred) {
//		for(String el : list) {
//			if(pred.test(el))
//				return true;
//		}
//	}
	
	public static boolean likeAPredicate(String x) {
		return Character.isUpperCase(x.charAt(0));
	}
}

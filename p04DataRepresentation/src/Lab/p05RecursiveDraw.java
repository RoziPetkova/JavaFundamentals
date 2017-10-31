package Lab;

import java.util.Collections;
import java.util.Scanner;

public class p05RecursiveDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(printStr(a));
	}

	public static String printStr(int a) {
		String str = String.join("", Collections.nCopies(a, "*"));
		System.out.println(str);
		return str = a == 0 ? "" : (printStr(a - 1) + str.join("", Collections.nCopies(a, "#"))) + "\n";

		/*
		 * if (a == 0) { return str = "";
		 * 
		 * } else { System.out.println(str); return (printStr(a - 1) +
		 * str.join("", Collections.nCopies(a, "#"))) + "\n"; }
		 */

		/*
		 * if (n == 0) System.out.println( String.join("",
		 * Collections.nCopies(n,"*"))); printStr(n - 1);
		 * System.out.println(String.join("", Collections.nCopies(n, "#")));
		 */
	}
}

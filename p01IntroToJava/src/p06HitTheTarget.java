import java.lang.annotation.Target;
import java.util.Scanner;

public class p06HitTheTarget {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();
		printSum(target);
		printSubtraction(target);
	}

	public static void printSum(int n) {
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20; j++) {
				if ( i + j == n) {
					System.out.println(i + " + " + j + " = " + n );
				}
			}
		}
	}
	public static void printSubtraction(int n) {
		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20; j++) {
				if ( i - j == n) {
					System.out.println(i + " - " + j + " = " + n );
				}
			}
		}
	}

}

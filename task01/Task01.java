/* №1. найти результат выражения z = ((a - 3) * b / 2) + c;
 */

package by.java.training.task01;

/**
 * @author Siarhei Bialtsou
 */
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double z;

		/**
		 * a = 5; b = 13; c = 2; hardcore data;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Write basic data:");

		System.out.print("Write a>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("WRITE a>");
		}
		a = sc.nextInt();

		System.out.print("Write b>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("WRITE b>");
		}
		b = sc.nextInt();

		System.out.print("Write c>");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("WRITE c>");
		}
		c = sc.nextInt();
		
		sc.close();

		z = ((a - 3) * (double) b / 2) + c;

		System.out.print("Result equals > z = " + z);
	}
}

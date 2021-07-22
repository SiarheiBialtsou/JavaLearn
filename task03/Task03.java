/* №3. вычислить значение выражения по формуле (все переменные принимают 
 * действительные значения): z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - 
 * Math.sin(y)) * Math.tan(x*y);
 */

package by.java.training.task03;

import java.util.Scanner;

/**
 * @author Siarhei Bialtsou
 *
 */
public class Task03 {

	public static void main(String[] args) {

		double x;
		double y;
		double z;

		/**
		 * x = 1,57075; y = 1,57075; hardcore data;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Write basic data:");

		System.out.print("Write angle (rad) x>");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("WRITE ANGLE (rad) x>");
		}
		x = sc.nextDouble();

		System.out.print("Write angle (rad) y>");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("WRITE ANGLE (rad) y>");
		}
		y = sc.nextDouble();

		sc.close();

		z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) *
				Math.tan(x*y);

		System.out.print("Result equals > z = " + z);

	}
}

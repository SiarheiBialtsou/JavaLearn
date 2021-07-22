/* №2. вычислить значение выражения по формуле (все переменные принимают 
 * действительные значения): z = ((b + sqrt(b*b+4*a*c)/2/a - a*a*a*c + 1/b/b);
 */

package by.java.training.task02;

/**
 * @author Siarhei Bialtsou
 */
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		/**
		 * a = 5.1; b = 13; c = 2; hardcore data;
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Write basic data:");

		System.out.print("Write a>");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("WRITE a>");
		}
		a = sc.nextDouble();

		System.out.print("Write b>");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("WRITE b>");
		}
		b = sc.nextDouble();

		System.out.print("Write c>");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("WRITE c>");
		}
		c = sc.nextDouble();

		sc.close();

		z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 / a - a * a * a * c + 1 / 
				(b * b);
		
		System.out.print("Result equals > z = " + z);
	}
}

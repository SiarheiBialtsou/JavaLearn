/**№4 Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях). Поменять местами дробную и целую части числа и вывести 
 * полученное значение числа.
 */

package by.java.training.task04;

/**
 * @author Siarhei Bialtsou
 */

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		double rd, rd1;
		double dr;

		Scanner sc = new Scanner(System.in);

		System.out.print("Write number nnn.ddd > ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.print("WRITE NUMBER NNN.DDD > ");
		}
		rd = sc.nextDouble();

		rd1 = (int) rd / 1;

		dr = rd * 1000 - rd1 * 1000 + (double) rd1 / 1000;

		sc.close();

		System.out.print("number ddd.nnn > " + dr);

	}

}

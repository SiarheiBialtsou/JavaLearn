/**№4 Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целых
 * частях). Поменять местами дробную и целую части местами и вывести полученное значение числа.
 */
package by.java.training.task04;

/**
 * @author Siarhei Bialtsou
 */
import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        double rd;
        double rd1;
        double dr;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Write number nnn.ddd > ");

            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.print("WRITE NUMBER NNN.DDD > ");
                }
            rd = sc.nextDouble();
        } while ((rd >= 1000) | (rd <= -1000));

        sc.close();

        rd1 = (int) rd / 1;

        dr = rd * 1000 - rd1 * 1000 + (double) rd1 / 1000;

        System.out.print("number ddd.nnn > " + dr);
	}
}
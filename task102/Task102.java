/**Ветвления №2. Найти max{min(a, b), min (c, d)}.
 */
package by.java.training.task102;

/**
 * @author Siarhei Bialtsou
 */
import java.util.Scanner;

public class Task102 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double min1;
        double min2;
        double max;

        Scanner sc = new Scanner(System.in);

        System.out.println("Write data >");

        System.out.print("Write a >");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("WRITE a > ");
        }
        a = sc.nextDouble();

        System.out.print("Write b >");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("WRITE b > ");
        }
        b = sc.nextDouble();

        System.out.print("Write c >");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("WRITE c > ");
        }
        c = sc.nextDouble();

        System.out.print("Write d >");
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("WRITE d > ");
            }
        d = sc.nextDouble();
        sc.close();

        System.out.println("Writed data > (" + a + " , " + b + ") , (" + c + " , " + d + ")");

        if (a < b)
            min1 = a;
        else
            min1 = b;

        if (c < d)
            min2 = c;
        else
            min2 = d;

        if (min1 < min2)
            max = min2;
        else
            max = min1;

        System.out.println("\n\t\t   min1 \t" + min1 + "     min2 \t" + min2);

        System.out.print("\nMax of min twin data> " + max);
	}
}
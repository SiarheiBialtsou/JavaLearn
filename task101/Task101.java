/**Ветвления №1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он рпямоугольным.
 */
package by.java.training.task101;
/**
 * @author Siarhei Bialtsou
  */
import java.util.Scanner;

public class Task101 {

    public static void main(String[] args) {
        double a;
        double b;
        String result1;
        String result2;
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Write angle a > ");
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.print("WRITE ANGLE a > ");
                }
            a = sc.nextDouble();
        } while ((a >= 180) | (a <= 0));

        do {
            System.out.print("Write angle b > ");
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.print("WRITE ANGLE b > ");
                }
            b = sc.nextDouble();
        } while ((b >= 180) | (b <= 0));
        
        sc.close();
        
        if ((a + b) < 180) {
            result1 = "такой треуголник существует";
            if ((a == 90) | (b == 90) | ((a + b) == 90)) result2 = ", и он будет прямоугольным.";
            else result2 = ", и он НЕ будет прямоугольным.";
            }
        else {
            result1 = "такой треугольник не существует."; 
            result2 = "";
        }
        System.out.println("Angel: " + a + " и " + b);
        
        System.out.print("Result equals: \n" + result1 + result2);
    }
}
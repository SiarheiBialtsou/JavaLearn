/**№6. Для данной области составить линейную программу, которая печаиаеи true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false - в противном случае.
 */
package by.java.training.task06;
/**
 * @author Siarhei Bialtsou
 *
 */
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        byte x;			//для сокращения "многообразия" больших данных
        byte y;
        boolean result = true;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Write basic data x:");
        
        while (!sc.hasNextByte()) {
            sc.next();
            System.out.print("REwrite basic data x:");
        }
        x = sc.nextByte();
        
        System.out.print("Write basic data y:");

        while (!sc.hasNextByte()) {
            sc.next();
            System.out.print("REwrite basic data y:");
        }
        y = sc.nextByte();
        
        sc.close();
        
        if ((y > 0) & ((x > 2) | (x < -2)))  result = false;
        
        if ((y == -1) & (x == 0))  result = false;
        
        if ((y > 4) | (y < -3))  result = false;
        
        if ((y <=  0) & ((x > 4) | (x < -4)))  result = false;
        
        System.out.println("\n /basic data: (" + x + "; " + y + ")/");

        System.out.println("\n /RESULT/ " + result);
	}
}
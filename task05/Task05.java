/**№5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSс
 */
package by.java.training.task05;

/**
 * @author Siarhei Bialtsou
 *
 */
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
        int t;
        int h, m, s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Write basic data T:");

        do {
            System.out.print("WRITE T>");
            while (!sc.hasNextInt()) {		//защита от ввода других типов
                sc.next();
                System.out.print("WRITE T>");
                } 
            t = sc.nextInt();
            }
            while (t<0);			//защита от ввода отрицательного времени
        
        sc.close();        //закрытие сканера

        h = t / 60 / 60;    //вычисление значения часов
        
        m = t / 60 - h * 60; //вычисление значения минут
        
        s = t - 60 *(60 * h + m);//вычисление значения секунд

        System.out.print("remarka: Result equals > T = " + t + "с >=  \n" + h + "ч " + m + "мин " + s + "с");
    }
}
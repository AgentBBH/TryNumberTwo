/*
 * Дано 4-х значное число. Верно ли, что все цифры числа различны?
 */

package trainingManual;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 4-х значное число: ");
        int n = in.nextInt();
        int e = n % 10;
        int d = n % 100 / 10;
        int s = n / 100 % 10;
        int t = n / 1000;

        if (e != d && e != s && e != t && d != s && d != t && s != t) {
            System.out.println("Цифры в числе различны");
        } else {
            System.out.println("Есть повторяющиеся цифры");
        }
    }
}

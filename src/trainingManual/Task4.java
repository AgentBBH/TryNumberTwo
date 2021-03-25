/*
* Определить число, полученное выписыванием в обратном порядке цифр любого 4-х значного натурального числа n
 */

package trainingManual;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 4-х значное число: ");
        int n = in.nextInt();

        int e = n % 10;
        int d = n % 100 / 10;
        int s = n / 100 % 10;
        int t = n / 1000;

        System.out.println("Число перевертыш: " + e + d + s + t);
    }
}

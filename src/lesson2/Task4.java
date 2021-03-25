/*
* Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */

package lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int number1 = in.nextInt();
        System.out.println("Input second number: ");
        int number2 = in.nextInt();
        System.out.println("Input third number: ");
        int number3 = in.nextInt();
        int result = 0;

        if (number1 > 0) {
            result++;
        }
        if (number2 > 0) {
            result++;
        }
        if (number3 > 0) {
            result++;
        }

        System.out.println("Amount of plus numbers: " + result);
    }
}

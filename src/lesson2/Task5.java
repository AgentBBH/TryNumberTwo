/*
* Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */
package lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int number1 = in.nextInt();
        System.out.println("Input second number: ");
        int number2 = in.nextInt();
        System.out.println("Input third number: ");
        int number3 = in.nextInt();
        int amountPlus = 0;
        int amountMinus = 0;
        int amountZero = 0;

        if (number1 > 0) {
            amountPlus++;
        } else if (number1 == 0) {
            amountZero++;
        } else {
            amountMinus++;
        }

        if (number2 > 0) {
            amountPlus++;
        } else if (number2 == 0) {
            amountZero++;
        } else {
            amountMinus++;
        }

        if (number3 > 0) {
            amountPlus++;
        } else if (number3 == 0) {
            amountZero++;
        } else {
            amountMinus++;
        }

        System.out.println("Amount of plus number: " + amountPlus);
        System.out.println("Amount of minus number: " + amountMinus);
        System.out.println("Amount of zero: " + amountZero);

    }
}

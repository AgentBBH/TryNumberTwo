/*
* Даны 2 числа. Вывести большее из них
 */

package lesson2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int number1 = in.nextInt();
        System.out.println("Input second number: ");
        int number2 = in.nextInt();

        if (number1 > number2) {
            System.out.println("Greatest number: " + number1);
        } else {
            System.out.println("Greatest number: " + number2);
        }
    }
}

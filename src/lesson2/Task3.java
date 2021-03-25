/*
* Дано целое число. Если оно является положительным,
* то прибавить к нему 1.Если отрицательным, то вычесть из него 2.
* Если нулевым, то заменить его на 10. Вывести полученное число
 */
package lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = in.nextInt();

        if (number > 0) {
            number++;
            System.out.println("result: " + number);
        } else if (number < 0) {
            number -= 2;
            System.out.println("result: " + number);
        } else {
            System.out.println("result: 10");
        }
    }
}

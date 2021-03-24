/*
* В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
* и положительное оно или отрицательное. Например, "это однозначное положительное число".
* Достаточно будет определить, является ли число однозначным, двузначным или трехзначным и более.
 */

package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = in.nextInt();

        if (number >= 0 && number <= 9) {
            System.out.println("Your number consist of one digit plus");
        } else if (number >= 10 && number <= 99) {
            System.out.println("Your number consist of two digit plus");
        } else if (number >= 100 && number <= 999) {
            System.out.println("Your number consist of three digit plus");
        } else if (number < 0 && number >= -9) {
            System.out.println("Your number consist of one digit minus");
        } else if (number <= -10 && number >= -99) {
            System.out.println("Your number consist of two digit minus");
        } else if (number <= -100 && number >= -999) {
            System.out.println("Your number consist of three digit minus");
        }

    }
}

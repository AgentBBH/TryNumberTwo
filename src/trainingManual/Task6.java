/*
* Создайте число. Определите, является ли число трехзначным.
* Определите, является ли его последняя цифра семеркой.
* Определите, является ли число чётным.
 */
package trainingManual;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = in.nextInt();
        String str = "Число является";

        if (n > 99 && n < 1000) {
            str = str + " трёхзначным";
        }
        if (n % 2 == 0) {
            str = str + " чётным";
        }
        if (n % 10 == 7) {
            str = str + ", последняя цифра в числе 7";
        }

        System.out.println(str);

    }
}

/*
* Измените пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение
* т.е. факториал числа.
 */
package trainingManual;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        int k = n;

        while (k > 1) {
            factorial *= k;
            k--;
        }

        System.out.println("Факториал " + n + " равен " + factorial);

    }
}

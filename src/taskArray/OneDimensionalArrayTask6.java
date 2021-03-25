/*
 * Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
 * на экран в строку. Определить и вывести на экран сообщение о том, является ли
 * массив строго возрастающей последовательностью.
 */
package taskArray;

import java.util.*;

public class OneDimensionalArrayTask6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 4;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "Sequence increases" : "Sequence not increases");
    }
}

/*
 * Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
 * массив на экран в строку. Замените каждый элемент с нечётным индексом на
 * ноль. Снова выведете массив на экран на отдельной строке.
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayTask4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 20;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(20);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

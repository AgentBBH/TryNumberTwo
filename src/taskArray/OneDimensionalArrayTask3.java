/*
 * Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
 * массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
 * это количество на экран на отдельной строке.
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayTask3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 15;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(99);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even elements: " + count);


    }
}

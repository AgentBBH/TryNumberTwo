/*
 * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
 * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
 * арифметическое элементов каждого массива и сообщите, для какого из
 * массивов это значение оказалось больше (либо сообщите, что их средние
 * арифметические равны).
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayTask5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 5;
        int[] arrayOne = new int[n];
        int[] arrayTwo = new int[n];

        for (int i = 0; i < n; i++) {
            arrayOne[i] = rand.nextInt(15);
            arrayTwo[i] = rand.nextInt(15);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arrayOne[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(arrayTwo[i] + " ");
        }

        System.out.println();

        double averageArrayOne = 0;
        double averageArrayTwo = 0;
        for (int i = 0; i < n; i++) {
            averageArrayOne += arrayOne[i];
            averageArrayTwo += arrayTwo[i];
        }

        averageArrayOne /= n;
        averageArrayTwo /= n;

        if (averageArrayOne > averageArrayTwo) {
            System.out.println("Average of the first array the greater");
        } else if (averageArrayOne < averageArrayTwo) {
            System.out.println("Average of the second array the greater");
        } else {
            System.out.println("Average of the two arrays are equal");
        }
    }

}

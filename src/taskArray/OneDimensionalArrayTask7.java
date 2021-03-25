/*
 * Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
 * какой элемент является в этом массиве максимальным и сообщите индекс его
 * последнего вхождения в массив.
 */

package taskArray;

import java.util.Random;

public class OneDimensionalArrayTask7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 12;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(15);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int max = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] >= array[max]) {
                max = i;
            }
        }

        System.out.println("Maximum element: " + array[max]);
        System.out.println("Maximum element index: " + (max + 1));
    }
}

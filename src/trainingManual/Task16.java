/*
* Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
 */

package trainingManual;

import java.util.*;

public class Task16 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(20);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
            if (array[i] > array[max]) {
                max = i;
            }
        }

        System.out.println("Maximal element: " + array[max]);
        System.out.println("Minimal element: " + array[min]);

        int tmp;
        if (min > max) {
            tmp = min;
            min = max;
            max = tmp;
        }
        int sum = 0;
        for (int i = min + 1; i < max; i++) {
            sum += array[i];
        }

        System.out.println("Sum of element: " + sum);

    }
}

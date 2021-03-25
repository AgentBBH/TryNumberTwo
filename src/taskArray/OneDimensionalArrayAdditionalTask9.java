/*
 * Найти наименьший элемент среди элементов с четными индексами массива
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length of the array: ");
        int n = in.nextInt();

        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int min = 1;
        for (int i = 1; i < n; i = i + 2) {
            if (array[i] < array[min]) {
                min = i;
            }
        }

        System.out.println("Minimum element among even-indexed elements: " + array[min]);

    }

}

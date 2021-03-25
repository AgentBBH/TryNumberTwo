/*
 * Найти средне арифметическое элементов массива, превосходящих некоторое число С.
 */
package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length of the array: ");
        int n = in.nextInt();
        System.out.println("Input number C: ");
        int c = in.nextInt();
        Random rand = new Random();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(50);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        double average = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > c) {
                average += array[i];
                count++;
            }
        }

        average /= count;
        System.out.println("Arithmetic mean of array elements exceeding a certain number C: " + average);

    }
}

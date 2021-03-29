/*
 * Найти среднее арифметическое элементов с нечетными номерами.
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length of the array: ");
        int n = in.nextInt();
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
            if (i % 2 == 0) {
                average += array[i];
                count++;
            }
        }

        average /= count;
        System.out.printf("Sum of elements multiples of three: %.3f", average);
    }
}

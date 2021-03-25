/*
 * Найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве.
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask8 {
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

        int maxOne = 0;
        int maxTwo = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] > array[maxOne]) {
                maxTwo = maxOne;
                maxOne = i;

            }
        }

        System.out.println("Second largest element: " + array[maxTwo]);
    }
}

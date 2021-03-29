/*
 * Найти произведение элементов, кратных 3.
 */
package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask1 {
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

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 3 == 0) {
                sum += array[i];
            }
        }

        System.out.println("Sum of elements multiples of three: " + sum);
    }
}

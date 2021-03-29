/*
 * Найти наименьший нечетный элемент.
 */
package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask4 {
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

        int min = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] < array[min] && array[i] % 2 != 0) {
                min = i;
            }
        }

        if (array[min] % 2 != 0) {
            System.out.println("The smallest odd element: " + array[min]);
        } else {
            System.out.println("There is no smallest odd element");
        }
    }
}

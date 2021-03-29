/*
 * Найти максимальный элемент в массиве и поменять его местами с нулевым элементом
 */
package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask10 {
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

        int max = 1;
        for (int i = 1; i < n; i = i + 2) {
            if (array[i] > array[max]) {
                max = i;
            }
        }

        int tmp = array[max];
        array[max] = array[0];
        array[0] = tmp;

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }
}

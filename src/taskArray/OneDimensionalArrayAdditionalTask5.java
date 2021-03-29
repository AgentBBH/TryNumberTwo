/*
 * «Сожмите» массив, выбросив из него каждый второй элемент.
 * «Освободившиеся» места массива заполните нулями.
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask5 {
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

        for (int i = 1; i < n; i = i + 2) {
            array[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

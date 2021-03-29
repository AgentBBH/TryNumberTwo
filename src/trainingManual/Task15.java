/*
 * Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать
 * (при переворачивании нежелательно создавать ещё один массив)
 */
package trainingManual;

import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(15);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int tmp;
        for (int i = 0; i < n / 2; i++) {
            tmp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = tmp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

/*
 * Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.
 */

package trainingManual;

import java.util.*;

public class Task14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(20);
        int[] arrayMarks = new int[n];

        for (int i = 0; i < n; i++) {
            arrayMarks[i] = rand.nextInt(9) + 1;
            System.out.print(arrayMarks[i] + " ");
        }

        System.out.println();

        int max = 0;
        int min = 0;

        for (int i = 1; i < n; i++) {
            if (arrayMarks[i] < arrayMarks[min]) {
                min = i;
            }
            if (arrayMarks[i] > arrayMarks[max]) {
                max = i;
            }
        }

        System.out.println("Maximum : " + arrayMarks[max] + ", her number " + (max + 1));
        System.out.println("Minimal mark: " + arrayMarks[min] + ", her number " + (min + 1));
    }
}

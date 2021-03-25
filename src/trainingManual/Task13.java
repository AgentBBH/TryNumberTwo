/*
* СОздать последовательность случайных чисел, найти и вывести наибольшее из них.
 */
package trainingManual;

import java.util.*;

public class Task13 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Input array length: ");
        int n = in.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Greatest element: " + max);
    }
}

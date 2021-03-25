/*
 * Подсчитать, сколько раз встречается элемент с заданным значением.
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of the array: ");
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

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == c) {
                count++;
            }
        }

        System.out.println(count > 0 ? "Number of equal C elements: " + count : "No equal C elements");
    }
}

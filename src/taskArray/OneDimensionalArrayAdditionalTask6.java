/*
 * Проверить, различны ли все элементы массива.
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayAdditionalTask6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the length of the array: ");
        int n = in.nextInt();
        Random rand = new Random();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(50);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        }

        System.out.println(flag ? "All elements are different " : "There are duplicate element");
    }
}

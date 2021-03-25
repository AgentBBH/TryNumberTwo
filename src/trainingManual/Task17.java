/*
* создать двухмерный массив, и заполнить его "бабочкой", т.е. таким образом:
* 1 1 1 1 1
* 0 1 1 1 0
* 0 0 1 0 0
* 0 1 1 1 0
* 1 1 1 1 1
 */

package trainingManual;

import java.util.*;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of rows and columns (row = columns): ");
        int n = in.nextInt();

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {                                       // element of main diagonal
                    array[i][j] = 1;
                } else if (i + j == n -1) {                         // element of side diagonal
                    array[i][j] = 1;
                } else if (i + j >= n - 1 && i > j) {               // lower triangle
                    array[i][j] = 1;
                } else if (i + j < n - 1 && i < j) {                // upper triangle
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

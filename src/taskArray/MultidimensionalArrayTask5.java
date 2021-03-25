/*
 * Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
 * случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
 * матрицы).
 * Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
 */

package taskArray;

import java.util.*;

public class MultidimensionalArrayTask5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of rows (rows = columns): ");
        int row = in.nextInt();

        System.out.println("Original matrix: ");
        Random rand = new Random();
        int[][] matrix = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = rand.nextInt(50);
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transposed matrix: ");

        int tmp;
        for (int i = 1; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }


    }
}

/*
 * Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
 * случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
 * матрицы).
 * Проверить произведение элементов какой диагонали больше.
 */
package taskArray;

import java.util.*;

public class MultidimensionalArrayTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of rows (rows = columns): ");
        int row = in.nextInt();

        Random rand = new Random();
        int[][] matrix = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = rand.nextInt(50);
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }

        int multiMainDiagonal = 1;
        int multiNotMainDiagonal = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i == j) {
                    multiMainDiagonal *= matrix[i][j];
                }
                if (i + j == row - 1) {
                    multiNotMainDiagonal *= matrix[i][j];
                }
            }
        }

        System.out.println("Multiplication of main diagonal elements: " + multiMainDiagonal);
        System.out.println("Multiplication of not main diagonal elements: " + multiNotMainDiagonal);
    }
}

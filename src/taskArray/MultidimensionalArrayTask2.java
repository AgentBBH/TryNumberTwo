/*
 * Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
 * случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
 * матрицы).
 * Вывести нечетные элементы находящиеся под главной диагональю(включительно).
 */
package taskArray;

import java.util.*;

public class MultidimensionalArrayTask2 {
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

        System.out.print("Odd elements under the main diagonal: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (matrix[i][j] % 2 != 0) {
                        System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}

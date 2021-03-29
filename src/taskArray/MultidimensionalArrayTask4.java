/*
 * Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
 * случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
 * матрицы).
 * Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
 */
package taskArray;

import java.util.*;

public class MultidimensionalArrayTask4 {
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

        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i + j < row - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of elements over the side diagonal: " + sum);
    }
}

/*
 * Пользователь должен указать с клавиатуры положительное число, а
 * программа должна создать массив указанного размера из случайных целых
 * чисел из [0;15] и вывести его на экран в строку. После этого программа должна
 * определить и сообщить пользователю о том, сумма какой половины массива
 * больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
 * пользователь введёт неподходящее число, то выдать соответствующее
 * сообщение
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayTask9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = -1;
        while (n < 0) {
            System.out.println("Input the size of array: ");
            n = in.nextInt();
            if (n > 0) {
                break;
            }
            System.out.println("You entered the wrong number. Try again.");
        }

        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(15);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n / 2; i++) {
            sumLeft += array[i];
            sumRight += array[n - i - 1];
        }

        if (sumLeft > sumRight) {
            System.out.println("The sum of the left side is greater");
        } else if (sumRight > sumLeft) {
            System.out.println("The sum of the right side is greater");
        } else {
            System.out.println("The sum of the two parts are equal");
        }

    }
}

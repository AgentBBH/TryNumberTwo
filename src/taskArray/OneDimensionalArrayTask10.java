/*
 * Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
 * переменную n. Если пользователь ввёл не подходящее число, то программа
 * должна выдать соответствующее сообщение. Создать массив из n случайных
 * целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
 * только из чётных элементов первого массива, если они там есть, и вывести его
 * на экран.
 */

package taskArray;

import java.util.*;

public class OneDimensionalArrayTask10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 1;
        while (n < 3) {
            System.out.println("Input a number greater than three: ");
            n = in.nextInt();
            if (n > 3) {
                break;
            }
            System.out.println("You entered the wrong number. Try again.");
        }

        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(n);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        if (count > 0) {
            int[] arrayEvenNumber = new int[count];
            int indexTwoArray = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] % 2 == 0) {
                    arrayEvenNumber[indexTwoArray] = array[i];
                    indexTwoArray++;
                }
            }

            for (int i = 0; i < count; i++) {
                System.out.print(arrayEvenNumber[i] + " ");
            }
        } else {
            System.out.println("No even elements");
        }

    }

}

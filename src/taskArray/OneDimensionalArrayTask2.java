/*
* Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
* строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
* порядке (99 97 95 93 … 7 5 3 1).
 */

package taskArray;

public class OneDimensionalArrayTask2 {
    public static void main(String[] args) {
        int n = 50;
        int[] array = new int[n];

        int count = 1;
        for (int i = 0; i < n; i++) {
            array[i] = count;
            count += 2;
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

/*
* Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
* массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
* затем в столбик (отделяя один элемент от другого началом новой строки). Перед
* созданием массива подумайте, какого он будет размера.
 */

package taskArray;

public class OneDimensionalArrayTask1 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];

        int count = 2;
        for (int i = 0; i < n; i++) {
            array[i] = count;
            count += 2;
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}

/*
* Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
package lesson3;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}

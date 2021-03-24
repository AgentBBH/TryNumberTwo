/*
* Одноклеточная амеба каждые 3 часа делится на 2 клетки.
* Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
package lesson3;

public class Task2 {
    public static void main(String[] args) {
        int amountAmeba = 1;
        int hour = 3;
        while (hour <= 24) {
            amountAmeba = amountAmeba * 2;
            System.out.println("Hour : " + hour + " \\ Ameba : " + amountAmeba);
            hour += 3;
        }
    }
}

/*
* Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунда:
* А) минут + секунд
* B) часов + минут + секунд
* C) дней + часов + минут + секунд
* D) недель + дней + часов + минут + секунд
 */

package trainingManual;

public class Task3 {
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int day = h % 24;
        int d = (h - day) / 24;
        int week = d % 7;
        int w = (d - week) / 7;

        System.out.println("A) " + min + " минут " + sec + " секунд");
        System.out.println("B) " + h + " часов " + min + " минут " + sec + " секунд");
        System.out.println("C) " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд");
        System.out.println("D) " + w + " недель " + day + " дней " + h + " часов " + min + " минут " + sec + " секунд");
    }
}

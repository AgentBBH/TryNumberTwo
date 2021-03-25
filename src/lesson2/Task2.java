/*
* Треугольник существует только тогда, когда сумма любых двух его сторон
* больше третьей. Определить существует ли такой треугольник.
* Дано: a, b, c –стороны предполагаемого треугольника.
* Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
* Если хотя бы в одном случае отрезок окажется больше суммы двух других,
* то треугольника с такими сторонами не существует.
 */

package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input side length a: ");
        int a = in.nextInt();
        System.out.println("Input side length b: ");
        int b = in.nextInt();
        System.out.println("Input side length c: ");
        int c = in.nextInt();

        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("there is not triangle");
        } else {
            System.out.println("there is triangle");
        }
    }
}

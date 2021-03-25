/*
* Имеется прямоугольное отверстие размерами a и b, определить можно ли его полностью закрыть
* круглой картонкой радиусом r.
 */
package trainingManual;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину стророны a: ");
        double a = in.nextDouble();
        System.out.println("Введите длину стророны b: ");
        double b = in.nextDouble();
        System.out.println("Введите длину радиуса r: ");
        double r = in.nextDouble();

        if (sqrt(a * a + b * b) > 2 * r) {
            System.out.println("Закрыть отверстие круглой картонкой не выйдет");
        } else {
            System.out.println("Закрыть отверстие круглой картонкой получится");
        }

    }
}

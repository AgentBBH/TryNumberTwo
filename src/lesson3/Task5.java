/*
* Напишите программу печати таблицы перевода расстояний из дюймов
* в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */

package lesson3;

import java.text.DecimalFormat;

public class Task5 {
    public static void main(String[] args) {
        double result = 1.54;
        String str = "";
        for (int i = 1; i < 21; i++) {
            DecimalFormat res = new DecimalFormat("##.###");
            if (i == 1) {
                str = " дюйм ";
            } else if (i % 10 > 1 && i % 10 < 5 && i < 10) {
                str = " дюйма ";
            } else {
                str = " дюймов ";
            }
            System.out.println(i + str + "= " + res.format(result) + " см");
            result += 1.54;
        }
    }
}

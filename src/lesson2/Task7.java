/*
* В переменную записываете количество программистов.
* В зависимости от количества программистов необходимо вывести
* правильно окончание. Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */

package lesson2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of programmers: ");
        int amountProg = in.nextInt();
        String str = "Программист";

        if (amountProg % 100 >= 10 && amountProg % 100 <= 19 || amountProg % 10 == 0)
            System.out.println(amountProg + " " + str + "ов");
        else {
            switch (amountProg % 10) {

                case 2:
                case 3:
                case 4:
                    System.out.println(amountProg + " " + str + "а");
                    break;
                default:
                    break;
            }

            switch (amountProg % 10) {
                case 1:
                    System.out.println(amountProg + " " + str);
                    break;
                case 5:
                case 7:
                case 6:
                case 8:
                case 9:
                    System.out.println(amountProg + " " + str + "ов");
                    break;
                default:
                    break;
            }
        }
    }
}

/*
* Имеется целое число (задать с помощью Random rand = new Random(); int x = rand.nextInt();)
* Это число - количество денег в рублях. Вывести это число, добавив к нему слово "рублей" в правильном падеже
 */
package trainingManual;

import java.util.Random;

import static java.lang.Math.abs;

public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        String str = "рубл";
        switch (abs(x % 10)) {
            case 1 :  str = str + "ь";
            break;
            case 2:
            case 3 :
            case 4 : str = str + "я";
            break;
            case 0 :
            case 5 :
            case 6 :
            case 7 :
            case 8 :
            case 9 : str = str + "ей";
            break;
        }
        System.out.println(x + " " + str);


    }
}

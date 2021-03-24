/*
* Имеется целое число, определить является лиэто число простым, т.е. делится без остатка на 1 и себя
 */

package trainingManual;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = in.nextInt();

        int i = 2;
        boolean flag = true;
        while (i < n / 2) {
            if (n % i == 0) {
                flag = false;
                break;
            }
            i++;
        }

        if (flag) {
            System.out.println("This is prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }
}

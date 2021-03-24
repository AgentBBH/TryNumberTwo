/*
* Найдите сумму первых n целых чисел, которые делятся на три
 */
package trainingManual;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = in.nextInt();
        int sum = 0;
        int i = 0;
        int k = 3;

        while (i < n) {
            sum += k;
            k += 3;
            i++;
        }

        System.out.println("The sum is " + sum);
    }
}

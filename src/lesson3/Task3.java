/*
* Вычислить: 1+2+4+8+...+256
 */
package lesson3;

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (sum < 256) {
            sum += count;
            count *= 2;
        }
        System.out.println("Result: " + sum);
    }
}

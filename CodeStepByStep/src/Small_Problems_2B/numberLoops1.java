/*
 * 
 * Write nested for loops to produce the following output:
 * 
 *  1
 *  22
 *  333
 *  4444
 *  55555
 * 
 */
package Small_Problems_2B;

public class numberLoops1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
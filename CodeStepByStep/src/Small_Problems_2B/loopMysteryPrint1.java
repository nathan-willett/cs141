/*
 * 
 * What does the following code print out?
 *
 *   for (int i = 1; i <= 10; i++) {
 *       for (int j = 1; j <= 10 - i; j++) {
 *           System.out.print(" ");
 *       }
 *       for (int j = 1; j <= 2 * i - 1; j++) {
 *           System.out.print("*");
 *       }
 *       System.out.println();
 *   }
 *   for (int i = 1; i <= 10; i++) {
 *       for (int j = 1; j <= 10 - i; j++) {
 *           System.out.print(" ");
 *       }
 *       for (int j = 1; j <= 2 * i - 1; j++) {
 *           System.out.print("*");
 *       }
 *       System.out.println();
 *   }
 * 
 */
package Small_Problems_2B;

public class loopMysteryPrint1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
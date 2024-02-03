/*
 * Write a method named nameDiamond that accepts a string as a parameter and prints it in a "diamond" format 
 * as shown below. For example, the call of nameDiamond("MARTY"); should print:
 * 
 *   M
 *   MA
 *   MAR
 *   MART
 *   MARTY
 *    ARTY
 *     RTY
 *      TY
 *       Y
 */

package SmallProblems5A__2_2;

public class nameDiamondClass {
    public static void main(String[] args) {
        nameDiamond("MARTY");
    }

    public static void nameDiamond(String name) {
        
        for (int l = 0; l < name.length(); l++) {
            System.out.pringln(name.charAt(l));
        }
    }
}

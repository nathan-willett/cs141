import java.util.Scanner;

// move print messages outside of the if statements. change to if else. 
/*
 * if (times == 1) {
 *     count1++;
 * } else if times == 2) {}
 */

public class contribution {
    public static void main(String[] args) {
        System.out.print("Is your money multiplied 1 or 2 times? ");
        int times = console.nextInt();

        if (times == 1) {
            System.out.print("And how much are you contributing? ");
            int donation = console.nextInt();
            sum = sum + donation;
            count1++;
            total = total + donation;
        }
        if (times == 2) {
            System.out.print("And how much are you contributing? ");
            int donation = console.nextInt();
            sum = sum + 2 * donation;
            count2++;
            total = total + donation;
        }
        console.close();
    }
}

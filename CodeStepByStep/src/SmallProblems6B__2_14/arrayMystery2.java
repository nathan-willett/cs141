/*
 * Consider the following method:
 * 
 * For each array below, indicate what the array's contents would be after the method mystery 
 * were called and passed that array as its parameter.
 */

package SmallProblems6B__2_14;

import java.util.Arrays;

public class arrayMystery2 {
    public static void main(String[]args) {
<<<<<<< HEAD
        int[] list = {6, 3};
        mystery2(list); // Call the mystery2 method to modify the array
        System.out.println(Arrays.toString(list)); // Print the modified array
    }

    public static void mystery2(int[] list) {
=======
        int[] list = {2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(mystery2(list)));
    }

    public static int[] mystery2(int[] list) {
>>>>>>> 876a6286992a8b49f264cd0bdece3896b8c52559
        for (int i = 0; i < list.length - 1; i++) {
            if (i % 2 == 0) {
                list[i]++;
            } else {
                list[i]--;
            }
        }
    }
}
/*
 * Consider the following method:
 * 
 * For each array below, indicate what the array's contents would be after the method mystery 
 * were called and passed that array as its parameter.
 */

package SmallProblems6B__2_14;

public class arrayMystery2 {
    public static void main(String[]args) {
        int[] list = {6, 3};
        System.out.println(mystery2(list));
    }

    public static int mystery2(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (i % 2 == 0) {
                list[i]++;
            } else {
                list[i]--;
            }
        }
        return list;
    }
}
/*
 * Consider the following method:
 * 
 * For each array below, indicate what the array's contents would be after 
 * the method mystery were called and passed that array as its parameter.
 */

package SmallProblems7A__2_19;

public class arrayMystery3 {
    public static void main(String[] args) {
        
    }

    public static void mystery3(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
            nums[i + 1]++;
            }
        }
    }           
}

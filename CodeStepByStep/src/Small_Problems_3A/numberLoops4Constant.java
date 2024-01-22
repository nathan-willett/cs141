/* 
 * 
 * The following program uses nested for loops to produce the following output:
 * 
 * ....1
 * ...2.
 * ..3..
 * .4...
 * 5....
 * 
 * Modify the program to use a single integer constant named SIZE that influences how many lines should
 * be drawn. For example, if the SIZE is changed to 7, the output should become the following:
 * 
 * ......1
 * .....2.
 * ....3..
 * ...4...
 * ..5....
 * .6.....
 * 7......
 * 
 */


package Small_Problems_3A;

public class numberLoops4Constant {
    public static void main(String[] args) {
        for (int y = 1; y <= 5; y++) {
            for (int x = 1; x <= 5 - y; x++) {
                System.out.print(".");
            }
            System.out.print(y);
            for(int x = 1; x <= y - 1; x++) {
                System.out.print(".");
            }
            System.out.println();
        }
        /* 
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(".");
            }
            System.out.print(i);
            for(int j)
            */
        }
    }

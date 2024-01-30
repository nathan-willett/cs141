/*
no semicolon on stepbystep

 * Write an expression that generates a random integer between 0 and 10 inclusive.
 * Random rand = new Random();
 * int n = ???;
 */

public class randomInteger0to10 {
    public static void main(String[] args) {
        Random rand = new Random();
    int n = rand.nextInt(11);
    }
}

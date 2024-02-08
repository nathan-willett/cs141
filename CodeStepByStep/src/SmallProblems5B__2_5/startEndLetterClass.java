/*
 * Write a method named startEndLetter that accepts a character (char) as a parameter. The method repeatedly prompts the user to enter 
 * console input until the user types two consecutive words that both start and end with that letter; for example, the word "shells" starts 
 * and ends with 's'. The method then prints a message showing the last word typed.
 * 
 * Your code should be case-insensitive; for example, if the character passed is the lowercase 't', you should also consider it a match if the 
 * user types a word that starts and ends with an uppercase 'T'. If the user types a one-letter word, that word is considered to start and end 
 * with its single letter. For example, the word "A" starts and ends with 'a'.
 * 
 * The following log represents the console output from a call to your method. (User input is shown like this.) Your method should exactly match 
 * the output structure and behavior shown below when given similar input.
 * 
 * startEndLetter('s');
 * 
 * Looking for two "s" words in a row.
 * Type a word: I
 * Type a word: love
 * Type a word: CS
 * Type a word: students
 * Type a word: PROGRAMS
 * Type a word: SCISSORS
 * Type a word: melon
 * Type a word: pens
 * Type a word: Q
 * Type a word: scores
 * Type a word: SOS
 * "s" is for "SOS"
 * 
 * Assumptions: You may assume that the parameter value passed will be a lowercase letter from 'a' to 'z' inclusive. You may also assume that 
 * the user will type a valid single-word response to each prompt and that the word will contain at least one character (the user will not type 
 * a blank line).
 * 
 * Constraints: You should not use any data structures such as arrays to help you solve this problem. You may declare as many simple variables 
 * such as ints or strings as you like. Be mindful of the differences between Java types String and char when solving this problem.
 */

// package SmallProblems5B__2_5;

// import java.util.Scanner;

// public class startEndLetterClass {
//     public static void main(String[] args) {
//         Scanner console = new Scanner(System.in);
//         System.out.println("Please enter a character."); // prompt the user for a char value
//         String a = console.nextLine(); // store the input as string 'a'
//         startEndLetter('t');
//         console.close();
//     }

//     public static String startEndLetter(char x) {
        
//     }
// }

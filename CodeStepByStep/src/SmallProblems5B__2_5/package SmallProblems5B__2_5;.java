package SmallProblems5B__2_5;

import java.util.Scanner;

public class StartEndLetterClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character:"); // Prompt for the character
        String charInput = input.nextLine();
        char a = charInput.length() > 0 ? charInput.toLowerCase().charAt(0) : 'a'; // Ensure we have a valid char
        startEndLetter(a);
    }

    public static void startEndLetter(char x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Looking for two \"" + x + "\" words in a row.");
        String lastWord = "";
        boolean foundOne = false;

        while (true) {
            System.out.println("Type a word: ");
            String word = input.nextLine();
            // Convert to lowercase to make case-insensitive comparison
            String wordLowerCase = word.toLowerCase();

            // Check if the word starts and ends with the character x
            if (wordLowerCase.startsWith(String.valueOf(x)) && wordLowerCase.endsWith(String.valueOf(x))) {
                if (foundOne) { // Check if the last word also met the condition
                    System.out.println("\"" + x + "\" is for \"" + word + "\"");
                    break;
                } else {
                    foundOne = true; // Mark this word as meeting the condition
                    lastWord = word; // Update lastWord to current word
                }
            } else {
                foundOne = false; // Reset if the current word doesn't meet the condition
            }
        }
    }
}

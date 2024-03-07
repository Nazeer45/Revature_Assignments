/*1. Write a program to check if the letter 'e' is present in the word 'Umbrella'.
*/

public class Problem01 {
    public static void main(String[] args) {
        String word = "Umbrella";

        if (word.contains("e")) {
            System.out.println("The word \"" + word + "\" contains the letter 'e'");
        } else {
            System.out.println("The word \"" + word + "\" does not contain the letter 'e'");
        }
    }
}

/*7. Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”.*/

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the substring to replace: ");
        String substringToReplace = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacementString = scanner.nextLine();

        String modifiedSentence = sentence.replace(substringToReplace, replacementString);

        System.out.println("Modified sentence: " + modifiedSentence);

        scanner.close();
    }
}

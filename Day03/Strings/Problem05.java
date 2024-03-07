/*5. Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by . (For example if input string is “bob has a radar plane” then it should convert in “** has a ***** plane”.
*/

import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = replacePalindromes(input);

        System.out.println("Modified string: " + result);

        scanner.close();
    }

    private static String replacePalindromes(String str) {
        String[] words = str.split(" ");
        StringBuilder modified = new StringBuilder();

        for (String word : words) {
            if (isPalindrome(word)) {
                StringBuilder asterisks = new StringBuilder();
                for (int i = 0; i < word.length(); i++) {
                    asterisks.append("*");
                }
                modified.append(asterisks).append(" ");
            } else {
                modified.append(word).append(" ");
            }
        }

        return modified.toString().trim();
    }

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

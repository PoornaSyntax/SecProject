package org.example.Project2;

import java.util.Scanner;

public class Q4Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        boolean isPalindromeWord=isPalindrome(word);
         if (isPalindrome(word))  {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    public  static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert the word to lowercase for case-insensitive comparison
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

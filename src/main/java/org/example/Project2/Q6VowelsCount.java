package org.example.Project2;

public class Q6VowelsCount {
    public static void main(String[] args) {

                String inputString = "documentation";

                // Call the method to count vowels
                int vowelCount = countVowels(inputString);

                // Print the result
                System.out.println("Number of vowels in the string: " + vowelCount);
            }

            // Method to count vowels in a string
            public static int countVowels(String str) {
                // Convert the string to lowercase to handle both uppercase and lowercase vowels
                str = str.toLowerCase();

                int count = 0;

                // Iterate through each character in the string
                for (int i = 0; i < str.length(); i++) {
                    // Check if the character is a vowel (a, e, i, o, u)
                    char ch = str.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        count++;
                    }
                }

                // Return the total count of vowels
                return count;
            }
        }




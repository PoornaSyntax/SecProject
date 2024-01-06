package org.example.Project2;

public class Q9String_NonRepeatingCharacter {
    /*
    Find the First Non-Repeating Character in a String: Given a string, find and
return the first non-repeating character. For example, in the string
"abracadabra", the first non-repeating character is 'c'
     */
    public static void main(String[] args) {
        String word = "abracadabra";
        boolean foundNonRepeating = false;

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            boolean isRepeated = false;

            for (int j = i + 1; j < word.length(); j++) {
                if(currentChar == word.charAt(j)){
                    isRepeated = true;
                    break;
                }
            }

            if(!isRepeated){
                System.out.println("The first non-repeating character is: " + currentChar);
                 foundNonRepeating = true;
                break;

            }
        }
        if(!foundNonRepeating){
        System.out.println("There is no non-repeating character in the String");

    }


}}

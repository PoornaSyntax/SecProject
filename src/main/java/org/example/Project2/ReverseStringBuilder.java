package org.example.Project2;

public class ReverseStringBuilder {
    public static void main(String[] args) {

        String word = "Hello";
        String reverse = reverseString(word);
        System.out.println("The String after reverse is "+reverse);
    }
        public static String reverseString(String word){
        StringBuilder reverseWord=new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--){
            reverseWord.append(word.charAt(i));

    }
    return reverseWord.toString();
}}

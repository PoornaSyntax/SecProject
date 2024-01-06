package org.example.Project2;

public class Q3Reverse_String {
    public static void main(String[] args) {


    /*
    Reverse a String: Write a function to reverse a given string. For example,
     given the input "Hello", the output should be "olleH"
     */
        String words = "Hello";
        String reverseString = Reverse(words);
        System.out.println("String before reverse " + words);
        System.out.println("String after reverse "+ reverseString);
    }
      private static String Reverse(String input) {
          String str = "";
          for (int i = input.length() - 1; i >= 0; i--) {
              str = str + input.charAt(i);
          }
          return str;

      }}




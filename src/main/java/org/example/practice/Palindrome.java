package org.example.practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner qq=new Scanner(System.in);
        System.out.println("Enter the String ");
        String str=qq.nextLine();
        String strToLowerCase=str.toLowerCase();
        String spacelessStr="";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=' '){
                spacelessStr=spacelessStr+strToLowerCase.charAt(i);
            }
        }

        String reversedString="";
        for (int i = spacelessStr.length()-1; i >=0  ; i--) {
            reversedString = reversedString + spacelessStr.charAt(i);
        }
        if (spacelessStr.equals(reversedString)){
            System.out.println("The string "+"'"+str+"'"+" Is a palindrome");
        }else {
            System.out.println("The string "+"'"+str+"'"+" Is not a palindrome");
        }
    }
}

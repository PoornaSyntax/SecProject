package org.example.practice;

import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the string");
        String str=sc.nextLine();
        System.out.println("The number of vowels in the string is "+countVowels(str));

    }
    public static int countVowels(String s){
       s=s.toLowerCase();
       int count =0;
       for (int i=0;i<s.length();i++){
           if (s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u'){
               count++;
           }

       }
       return count;
    }
}

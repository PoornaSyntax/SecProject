package org.example.Project2;

import java.util.Arrays;

public class Q5AnagramsString {
    /*
    Check if Two Strings are Anagrams: Given two strings, determine if they
are anagrams, meaning they contain the same characters in a different order.
For example, "listen" and "silent" are anagrams.
     */
    public static void main(String[] args) {
        String str1="SILENT";
        String str2="LISTEN";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("The two strings are not anagrams");
        }
        else{


        char[] c1=str1.toCharArray();
        char[] c2=str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
            boolean isAnagram=true;

         for(int i=0;i<c1.length;i++){
             if(c1[i]!=c2[i]){
                 System.out.println("The two strings are not anagrams");
                 isAnagram= false;
                 break;

             }
        }
         if (isAnagram) {
             System.out.println("The two strings are anagrams");
         }
    }
}}

package org.example.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter first string");
        String str1=sc.nextLine();
        System.out.println("Please enter second string");
        String str2=sc.nextLine();
        System.out.println(isAnagram(str1,str2));

    }

    public static boolean isAnagram(String str1,String str2){
         boolean isAnagrams=true;
         str1.toLowerCase();
         str2.toLowerCase();
         if (str1.length()!=str2.length()){
             return false;
         }

         char[] c1 = str1.toCharArray();
         char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i = 0;i<c1.length;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
            return true;
    }
}


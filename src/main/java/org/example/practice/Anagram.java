package org.example.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1=sc.nextLine();
        System.out.println("Enter second string");
        String str2=sc.nextLine();
        System.out.println(isAnagram(str1,str2));

    }
    public static boolean isAnagram(String str1, String str2){
        char[] c1 =str1.toLowerCase().replaceAll(" ","").toCharArray();
        char[] c2=str2.toLowerCase().replaceAll(" ","").toCharArray();

        if(c1.length!=c2.length){
            return false;
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i=0;i<c1.length-1;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;

    }
}

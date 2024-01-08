package org.example.practice;

public class Vowel {
    public static void main(String[] args) {
        String str = "documentation";
        int count =0;
        str.toLowerCase();
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='e' || str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("The vowels in the str "+str+ " is "+count);
    }
}

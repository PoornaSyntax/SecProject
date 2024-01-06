package org.example.Project2;

public class Q2AlphaCharacters {
    public static void main(String[] args) {
        String str = "Hello123World ddkl445 jjh8jke";
        int strAlphaCount = str.replaceAll("[^A-Za-z]", "").length();
        System.out.println("Input String: " + str);
        System.out.println("The alpha characters count is : "+strAlphaCount);




    }}
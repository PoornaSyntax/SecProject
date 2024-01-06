package org.example.Project2;

public class Q1StringSwap {
           public static void main(String[] args) {

            String Str1 = "Hello";
            String Str2 = "World";

            System.out.println("Before swapping:");
            System.out.println("First String: " + Str1);
            System.out.println("Second String: " + Str2);


            Str1 = Str1 + Str2;
            Str2 = Str1.substring(0, Str1.length() - Str2.length()); // 0,10-5=5(Hello)
            Str1 = Str1.substring(Str2.length()); // HelloWorld= 5=initial index, 9=final index
            System.out.println();
            System.out.println("After swapping using concat method:");
            System.out.println("First String: " + Str1);
            System.out.println("Second String: " + Str2);



        }
    }





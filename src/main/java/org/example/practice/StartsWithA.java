package org.example.practice;
import java.util.ArrayList;
public class StartsWithA{


/* You have a list of strings and you want to keep only those
that start with “A” and you want to return them in lower case".
Animal", "World", "America", "Hello", "Student", "Apple", "Avengers
 */

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Animal");
        str.add("World");
        str.add("America");
        str.add("Hello");
        str.add("Student");
        str.add("Apple");
        str.add("Avangers");
        str.add("Laptop");

        for(String s : str){
            if(s.startsWith("A")){
                System.out.println(s.toLowerCase());
            }
        }
    }
}


package org.example.Project2;

import java.util.ArrayList;
import java.util.List;

public class CharacterA {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Apple");
        str.add("Orange");
        str.add("Aunt");
        str.add("Antique");
        str.add("Fantastic");
        //str.replaceAll(s -> s.toLowerCase());

        str.replaceAll(String::toLowerCase);
        for(String s:str){
            if(s.startsWith("a")){
                System.out.println(s);
            }
        }
    }
}

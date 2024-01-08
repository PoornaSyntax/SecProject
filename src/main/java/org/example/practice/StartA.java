package org.example.practice;


import java.util.ArrayList;
import java.util.List;

public class StartA {
    public static void main(String[] args) {
        List<String> str= new ArrayList<String>();
        str.add("Apple");
        str.add("Antique");
        str.add("Orange");
        str.add("Aunt");
        str.add("Fantastic");
        str.replaceAll(s->s.toLowerCase());
        //str.replaceAll(String::toLowerCase);
//        for(int i= 0;i<str.size();i++){
//            str.set(i,str.get(i).toLowerCase());
//        }
        for(String s:str){
            if(s.startsWith("a")){
                System.out.println(s);
            }
        }


}}

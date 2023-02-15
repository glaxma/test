package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ExperimentGit {


    public static void main(String[] args) {
        // TODO document why this method is empty
        test();
    }
    public static void test(){
        List<String> name=new ArrayList<>();
        name.add("ramesh");
        name.add("suresh");
        name.add("ravesh");
        name.add("pavesh");
        name.add("sukesh");
       String peoples=  String.format("the name one is %s",name);
        System.out.println("total names are:"+peoples);
        for(String n:name){
            System.out.println( n.toLowerCase());
        }

    }

}

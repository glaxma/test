package org.example;

import java.util.*;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;


public class ExperimentGit {


    public static void main(String[] args) {
        // TODO document why this method is empty
        test();
    }
    public static void test(){
//        Set<String> data = new LinkedHashSet<String>();
//        List<String> fruit=new ArrayList<>();
         Map<Integer, String> map=new HashMap<>();
        map.put(1,"suresh");
        map.put(2,"ramesh");
        map.put(3,"ravi");

        System.out.println( map);
        System.out.println( map.containsValue("ravi"));

    }
    

}

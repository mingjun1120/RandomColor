package com.company;
import adt.*;
import adt.List;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        String[]str = {"red","orange","blue","yellow","green"};
//        RandomList randString = new RandomString(str);
//        randString.createRandomList(3);
//        System.out.println("randString = " + randString);

        List<Integer> fixList = new FixedList(10);
        for(int i = 0; i<100; i++){
            fixList.insert(i);
        }
        System.out.println("fixList = " + fixList);
    }
}

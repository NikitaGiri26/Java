package com.demo.beans;

import java.util.ArrayList;
import java.util.List;

public class a {
    
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);

        System.out.println(lst.size());
        // System.out.println(lst.capacity());
    }
}

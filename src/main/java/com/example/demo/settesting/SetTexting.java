package com.example.demo.settesting;

import java.util.HashSet;

public class SetTexting {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set.contains(2));
        System.out.println(set.contains(50));


    }
}

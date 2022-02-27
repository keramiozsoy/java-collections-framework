package com.keramiozsoy.arraylist;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.forEach(System.out::println);
    }
}

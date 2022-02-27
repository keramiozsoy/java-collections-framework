package com.keramiozsoy.treeset;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        final TreeSet<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.forEach(System.out::println);
    }
}

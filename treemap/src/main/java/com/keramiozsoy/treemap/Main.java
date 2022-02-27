package com.keramiozsoy.treemap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        final TreeMap<Integer, String> integerStringTreeMap = new TreeMap<>();
        integerStringTreeMap.put(1,"A");
        integerStringTreeMap.put(2,"B");
        integerStringTreeMap.put(3,"C");
        System.out.println("integerStringTreeMap = " + integerStringTreeMap);
    }
}

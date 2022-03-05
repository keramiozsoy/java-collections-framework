package com.ko.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");

        final Iterator iterator = list.iterator();
        for(int i = 0; i< 3; i++){
            System.out.println("element = " + iterator.next());
        }
    }
}

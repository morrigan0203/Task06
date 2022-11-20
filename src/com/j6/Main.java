package com.j6;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MySet my = new MySet();

        my.add(new Person("Pupkin", "Vaysa4", "", 25));
        my.add(new Person("Pupkin", "Vaysa2", "", 45));
        my.add(new Person("Pupkin", "Vaysa3", "", 65));
        my.add(new Person("Pupkin", "Vaysa3", "", 5));
//        my.forEach(p -> System.out.println(p));
        for(Person p : my.items.keySet()) {
            System.out.println(p);
        }

        TreeSet<Integer> tree = new TreeSet<>(new IntegerRevertComparator());
        tree.add(100);
        tree.add(10);
        tree.add(50);
        tree.add(150);
        tree.add(40);
        tree.add(170);
        for (Integer i : tree) {
            System.out.println(i);
        }
    }
}
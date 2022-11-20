package com.j6;

import java.util.*;

public class MainSeminar {
    public static void main(String[] args) {
        Comparator<Person> c = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n = o1.firstName.compareTo(o2.firstName);
                if (n == 0) {
                    return o1.age - o2.age;
                }
                return n;
            }
        };
        TreeSet<Person> my = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        my.add(new Person("Pupkin", "Vaysa4", "", 25));
        my.add(new Person("Pupkin", "Vaysa2", "", 45));
        my.add(new Person("Pupkin", "Vaysa3", "", 65));
        my.add(new Person("Pupkin", "Vaysa3", "", 5));

        Set<Person> hash = new HashSet<>(my);
        List<Person> l = new ArrayList<>(my);
//        Collections.sort(l, c);
        Arrays.sort(l.toArray(), new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Person)o1).age - ((Person)o2).age;
            }
        });

        l.forEach(p -> System.out.println(p));
    }
}

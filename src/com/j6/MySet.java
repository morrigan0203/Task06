package com.j6;

import java.util.HashMap;
import java.util.Map;

public class MySet {
    private static final Object obj = new Object();
    Map<Person, Object> items = new HashMap<>();

    public boolean add(Person person) {
        return items.put(person, obj) == null;
    }
}

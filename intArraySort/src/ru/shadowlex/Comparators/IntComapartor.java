package ru.shadowlex.Comparators;

import java.util.Comparator;

public class IntComapartor implements Comparator<Integer> {

    @Override
    public int compare(Integer var1, Integer var2) {
        return var1.compareTo(var2);
    }
}
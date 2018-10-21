package ru.shadowlex.Comparators;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

    @Override
    public int compare(String var1, String var2) {
        return var1.compareTo(var2);
    }
}

package ru.shadowlex;

import java.util.Comparator;
import java.util.List;

public interface Sort<T> {
    List<T> sort(List<T> list, Comparator<T> comparator);
}
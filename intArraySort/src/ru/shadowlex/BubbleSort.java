package ru.shadowlex;

import java.util.Comparator;
import java.util.List;

//sorts int array with bubble sorting method
public class BubbleSort<T> implements Sort<T> {

    public List<T> sort(List<T> list, Comparator<T> comparator) {
        List<T> innerList = list;

        for (int i = 0; i < (innerList.size() - 1); i++) {
            for (int j = 0; j < (innerList.size() - i - 1); j++) {
                if (comparator.compare(innerList.get(j), innerList.get(j + 1)) > 0) {
                    T garbage = innerList.get(j);
                    innerList.remove(j);
                    innerList.add(j + 1, garbage);
                }
            }
        }
        return innerList;
    }
}

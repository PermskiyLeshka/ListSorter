package ru.shadowlex;

import java.util.*;

public class MergeSort<T> implements Sort<T> {
    public List<T> sort(List<T> list, Comparator<T> comparator) {
        List<T> innerList = list;
        final int listSize = innerList.size();
        int r = innerList.size() / 2;
        int l = innerList.size() - r;
        List<T> left = new ArrayList<>();
        List<T> right = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            if (i < l) {
                left.add(innerList.get(i));
            } else {
                right.add(innerList.get(i));
            }
        }

        if (left.size() > 1) {
            left = sort(left, comparator);
        }

        if (right.size() > 1) {
            right = sort(right, comparator);
        }

        innerList = (List<T>) mergeArrays(left, right, comparator);

        return innerList;
    }

    //merge 2 sorted by reversion arrays
    public List<T> mergeArrays(List<T> a, List<T> b, Comparator comparator) {
        List<T> mergeArray = new ArrayList<>();
        int arrayLength = a.size() + b.size();
        int pointA = 0;
        int pointB = 0;
        int i = 0;
        for (; i < arrayLength - 1; i++) {
            //if a[i] < b[i] merge[i].add(a) and so on
            if (comparator.compare(a.get(pointA), b.get(pointB)) < 0) {
                //if a is empty fill the rest of mergearray from b (and vice versa)
                if (pointA == (a.size() - 1)) {
                    mergeArray.add(a.get(pointA));
                    i++;

                    while (i < arrayLength) {
                        mergeArray.add(b.get(pointB));
                        pointB++;
                        i++;
                    }
                } else {
                    mergeArray.add(a.get(pointA));
                    pointA++;
                }
            } else {
                if (pointB == (b.size() - 1)) {
                    mergeArray.add(b.get(pointB));
                    i++;

                    while (i < arrayLength) {
                        mergeArray.add(a.get(pointA));
                        pointA++;
                        i++;
                    }
                } else {
                    mergeArray.add(b.get(pointB));
                    pointB++;
                }
            }
        }
        return mergeArray;
    }
}

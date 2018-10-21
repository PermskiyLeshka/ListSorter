package ru.shadowlex;

import org.junit.Test;
import ru.shadowlex.Comparators.IntComapartor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        Sort<Integer> sorter = new MergeSort<>();
        List<Integer> actual = new ArrayList<>();
        actual.add(5);
        actual.add(0);
        actual.add(4);
        actual.add(2);
        actual.add(3);
        actual.add(1);
        actual = sorter.sort(actual, new IntComapartor());
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void mergeArrays() {
        Sort<Integer> sorter = new MergeSort<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(6);
        a.add(16);
        b.add(0);
        b.add(13);
        ArrayList<Integer> actual = (ArrayList<Integer>) ((MergeSort<Integer>) sorter).mergeArrays(a, b, new IntComapartor());
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(6);
        expected.add(13);
        expected.add(16);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
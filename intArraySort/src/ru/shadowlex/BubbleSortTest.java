package ru.shadowlex;

import ru.shadowlex.Comparators.IntComapartor;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @org.junit.Test
    public void sort() {
        BubbleSort<Integer> bubbleSort= new BubbleSort<>();
        List<Integer> actual = new ArrayList<>();
        actual.add(5);
        actual.add(0);
        actual.add(4);
        actual.add(2);
        actual.add(3);
        actual.add(1);
        actual = bubbleSort.sort(actual, new IntComapartor());
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
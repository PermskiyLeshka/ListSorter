package ru.shadowlex;

import ru.shadowlex.Comparators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>();
        Sort<Integer> sorter = new MergeSort<>();
        testList = (ArrayList<Integer>) sorter.sort(testList, new IntComapartor());

        System.out.println(testList);
    }
}
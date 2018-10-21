package ru.shadowlex.Comparators;

import ru.shadowlex.Employee;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee var1, Employee var2) {
        return var1.getName().compareTo(var2.getName());
    }
}

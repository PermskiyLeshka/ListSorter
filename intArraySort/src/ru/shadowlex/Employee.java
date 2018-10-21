package ru.shadowlex;

public class Employee {
    private String name;
    private int age;

    Employee(String aName, int aAge){
        name = aName;
        age = aAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return (name + " " + age);
    }
}

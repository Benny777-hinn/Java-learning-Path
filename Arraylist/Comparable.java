package Arraylist;

import java.util.*;
class Employee implements Comparable<Employee> {

    int age;

    Employee(int age) {
        this.age = age;
    }

    //Override the compareTo method
    public int compareTo(Employee e) {
        return this.age - e.age;
    }
}

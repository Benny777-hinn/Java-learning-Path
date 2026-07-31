package Arraylist;

import java.util.*;

public class SortComparable {
    
     public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(25));
        list.add(new Employee(18));
        list.add(new Employee(20));

        Collections.sort(list);

        for(Employee e : list)
            System.out.println(e.age);      
    }
}

package Arraylist;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add("Age");
        al1.add(20);
        al1.add(true);
        al1.add(40);
        al1.add(60);

        System.out.println(al1.contains(46));    //Search for any element in the ArrayList
        System.out.println(al1.indexOf(40));    //Returns the index of the element if found else -1
        System.out.println(al1.remove(0));    //Removes the element at the specified index
        System.out.println(al1.remove(al1.size()-1));    //Removes the element if found else returns false
        System.out.println(al1);
    }
}

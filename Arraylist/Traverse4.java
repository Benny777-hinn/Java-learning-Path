package Arraylist;

import java.util.ArrayList;
public class Traverse4 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add("Age");
        al1.add(20);
        al1.add(true);
        al1.add(40);
        al1.add(60);

        for(Object i : al1){
            System.out.println(i);
        }
    }
}

/*For each loop  In this loop we can access each element as an object WITHOUT ITERATOR  */

package Arraylist;

import java.util.ArrayList;

public class Traverse3 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add("add");
        al1.add(60);

        for(int i=0; i<al1.size();i++){
            System.out.println(al1.get(i));

        }




    }
}

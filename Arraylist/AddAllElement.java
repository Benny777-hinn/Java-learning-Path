package Arraylist;
import java.util.ArrayList;

public class AddAllElement {
    public static void main(String[] args){ 
        ArrayList nm = new ArrayList();

        nm.add("Chole");
        nm.add("Pani Puri");
        nm.add("Rajma Chaval");
        nm.add("Roti curry");

        System.out.println("North Indian menu: " + nm);

        ArrayList sm = new ArrayList();

        sm.add("Biryani");
        sm.add("Pongal");
        sm.add("Idly");
        sm.add("Dosa");

        System.out.println("South Indian menu: " + sm);

        ArrayList menu = new ArrayList();

        menu.addAll(nm);
        menu.addAll(sm);

        System.out.println("Menu: " + menu);
        

    }
}
// How to access the elements in the ArrayList 
   //iterable method , list iterator , get method 
   //traversing elements using iterator

/* Iterator is an object to access the elements 
Its present in Iterable interface  
Two methods:  Next and hasNext
Next method -- 
hasnext-- checks for next element presemt or not  */
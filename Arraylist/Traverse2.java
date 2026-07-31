package Arraylist;
import java.util.ListIterator;
import java.util.ArrayList;

public class Traverse2 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(60);

        ListIterator li = al1.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println();
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
    
}
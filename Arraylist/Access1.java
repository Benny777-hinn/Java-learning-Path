// How to access the elements in the ArrayList 
   //iterable method , list iterator , get method 
   //traversing elements using iterator

/* Iterator is an object to access the elements 
Its present in Iterable interface  
Two methods:  Next and hasNext
Next method -- 
hasnext-- checks for next element presemt or not  */

package Arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class Access1 {

    public static void main(String[] args) {
         ArrayList al = new ArrayList();

        al.add(20);
        al.add(34);
        al.add(45);
        al.add(43);

        Iterator i = al.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
        // System.out.println(i.hasNext());
        // System.out.println(i.next());

    }
    
}

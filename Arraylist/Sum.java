package Arraylist;
import java.util.Iterator;
import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
         ArrayList<Integer> al = new ArrayList();

        al.add(20);
        al.add(34);
        al.add(45);
        al.add(43);

        Iterator<Integer> i = al.iterator();
        int sum=0;

        for(int num : al){
            sum+=num;
        }
        System.out.println("Sum is :" + sum);
    }
    
}  

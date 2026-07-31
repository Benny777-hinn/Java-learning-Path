package Arraylist;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class EnterValue {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 elements: ");
        for(int i=1; i<=5; i++){
            al.add(scan.nextInt());
        }
        Iterator<Integer> i = al.iterator();
        int sum =0;
        while(i.hasNext()){
            System.out.println(i.next());
        }
        for(int num : al){
            sum+=num;
        }
        System.out.println("Sum is :" + sum);


        scan.close();



        


    
    }
}

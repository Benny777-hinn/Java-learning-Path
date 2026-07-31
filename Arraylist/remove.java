package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class remove {

	public static void main(String[]args) {
		ArrayList al = new ArrayList<>();
		
		al.add("A");
		al.add(99);
		al.add(true);
		al.add(70);
		al.add('@');
		al.add(55);
		
		System.out.println(al);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("The index value of element to remove is : ");
		int index = scan.nextInt();
		
		System.out.println("The removed element : " + al.remove(index) );
		
		System.out.println(al);
		
		scan.close();
	}
}

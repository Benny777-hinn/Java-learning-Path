package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove2 {

	public static void main(String[]args) {
		
		ArrayList<String>countries = new ArrayList <>();
		
		countries.add("India");
		countries.add("USA");
		countries.add("Australia");
		countries.add("UK");
		countries.add("Russia");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Before Removal :" + countries);
		System.out.println("Enter the country to remove : ");
		String KeyElement = scan.nextLine();
		
		if(countries.remove(KeyElement))
			System.out.println("Removed Successfully!");
		else {
			System.out.println("Country name not present! ");
		}
		
		System.out.println("Removed country : " + KeyElement);
		System.out.println("After Removal :" + countries);
		
		scan.close();
		
	}
}
//comparable 
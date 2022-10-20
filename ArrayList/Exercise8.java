// Write a Java program to sort a given array list.

import java.util.*;

public class Exercise8 
{
	public static void main(String[] args) 
	{
		// Creae a list and add some colors to the list
		List<String> myList = new ArrayList<String>();

		myList.add("Red");
		myList.add("Green");
		myList.add("Orange");
		myList.add("White");
		myList.add("Black");

		System.out.println("List before sort: " + myList);

		Collections.sort(myList);

		System.out.println("List after sort: " + myList);    
	}
}

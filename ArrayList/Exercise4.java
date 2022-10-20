// Write a Java program to retrieve an element 
// (at a specified index) from a given array list.

import java.util.*;

public class Exercise4 
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

		// Print the list
		System.out.println(myList);

		// Retrive the first and third element
		String element = myList.get(0);
		System.out.println("First element: " + element);
		
		element = myList.get(2);
		System.out.println("Third element: " + element);
	}
}

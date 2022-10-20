// Write a Java program to update specific array 
// element by given element.

import java.util.*;

public class Exercise5 
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

		// Update the third element with "Yellow"
		myList.set(2, "Yellow");
		
		// Print the list again
		System.out.println(myList);
	}
}

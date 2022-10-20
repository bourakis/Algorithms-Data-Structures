// Write a Java program to insert an element into the 
// array list at the first and at last position.

import java.util.*;

public class Exercise3 
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

		// Now insert a color at the first and last position of the list
		myList.add(0, "Pink");
		myList.add(5, "Yellow");

		// Print the list
		System.out.println(myList);
	}
}

// Write a Java program to remove the third element from a array list.

import java.util.*;

public class Exercise6 
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

		// Remove the third element from the list.
		myList.remove(2);

		// Print the list again
		System.out.println("After removing third element from the list:\n" + myList);
	}
}

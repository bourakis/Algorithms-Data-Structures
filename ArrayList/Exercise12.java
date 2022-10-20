// Write a Java program to extract a portion of a array list.

import java.util.*;

public class Exercise12 
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

		System.out.println("Original list: " + myList);

		List<String> sub_List = myList.subList(0, 3);
		
		System.out.println("List of first three elements: " + sub_List);
	}
}

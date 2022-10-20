// Write a Java program to shuffle elements in a array list.

import java.util.*;

public class Exercise10 
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

		System.out.println("List before shuffling:\n" + myList);  

		Collections.shuffle(myList);
		
		System.out.println("List after shuffling:\n" + myList); 
	}
}


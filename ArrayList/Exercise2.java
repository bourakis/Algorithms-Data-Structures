// Write a Java program to iterate through all elements in a array list.

import java.util.*;

public class Exercise2 
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
    for (String element : myList) 
    {
      System.out.println(element);
    }
  }
}

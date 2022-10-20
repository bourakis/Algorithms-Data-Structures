// Write a Java program to search an element in a array list.

import java.util.*;

public class Exercise7 
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

    // Search the value Red
    if (myList.contains("Red")) 
    {
      System.out.println("Found the element");
    } 
    else 
    {
      System.out.println("There is no such element");
    }
  }
}

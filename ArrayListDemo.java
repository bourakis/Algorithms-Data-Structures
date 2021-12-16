import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo 
{
  public static void main(String[] args) 
  {
    ArrayList<String> cars = new ArrayList<String>();
    
    // Add items
    // The ArrayList class has many useful methods. 
    // For example, to add elements to the ArrayList, 
    // use the add() method:
    cars.add("Volvo");
    cars.add("Mazda");
    cars.add("BMW");
    cars.add("Ford");
    
    System.out.println("Array list: " + cars);
    
    // Access an item.
    System.out.println("Item in position 0 is: " + cars.get(0));
    
    //ArrayList size
    System.out.println("ArrayList size: " + cars.size());
    
    // Change an item. Replace "Volvo" with "Opel" in 
    // position 0.
    System.out.println("Replace item in 0 position with \"Opel\".");
    cars.set(0, "Opel");
    System.out.println("Result" + cars);
    
    System.out.println("Remove the 0 item");
    cars.remove(0);
    System.out.println("Result" + cars);
    
    System.out.println();
    System.out.println();


    // Loop through an ArrayList
    System.out.println("Loop through an ArrayList:");
    for (int i = 0; i < cars.size(); i++) 
    {
      System.out.println(cars.get(i));
    }
    
    System.out.println();
    
    // Loop through an ArrayList with the for-each loop.
    System.out.println("ArrayList with for-each loop:");
    for (String i : cars) 
    {
      System.out.println(i);
    }
    
    System.out.println();
    
    //Other types of ArrayList
    System.out.println("Other types of ArrayList.");
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    
    for (int i : myNumbers) 
    {
      System.out.println(i);
    }
    
    System.out.println();
    
    // Sort an ArrayList using Collections
    System.out.println("Sort an ArrayList");
    Collections.sort(cars);  // Sort cars
    
    for (String i : cars) 
    {
      System.out.println(i);
    }
    
    System.out.println();
        
    // Sort an ArrayList of Integers
    System.out.println("Sort an ArrayList of Integers");
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) 
    {
      System.out.println(i);
    }
    
  }
}

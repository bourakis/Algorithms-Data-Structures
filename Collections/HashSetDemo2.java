
package hashsetexample;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo2 
{
    public static void main(String[] args) 
    {
        HashSet<String> mySet = new HashSet<String>();
        Scanner input = new Scanner(System.in);
      
        String m = "hello";
          
        while (!m.equals("stop"))
        {
            System.out.println("Δώσε το επόμενο String: ");
          
            m = input.next();
          
            if (!mySet.contains(m))
            {
                mySet.add(m);
            }
            mySet.remove("stop");
          
        // 2ος τροπος:
     /*
        while (!mySet.contains("stop")){
            System.out.println("Δώσε το επόμενο String: ");
            m = input.next();
            mySet.add(m);
        }
        mySet.remove("stop");
    */        

    // Εκτύπωση στοιχείων του HashSet
    // περνάμε ένα-ένα από τα στοιχεία του set
    // 1oς τρόπος
        }
      
        for (String s : mySet)
        {
          System.out.println(s);
        }
      
        // 2ος τροπος
        Object[] arr = mySet.toArray();
      
        for (int i=0; i<arr.length; i++)
        {
            String name = (String) arr[i];
            System.out.println(name);
        }
    }
}

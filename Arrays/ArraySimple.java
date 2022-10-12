import java.util.Arrays;

public class ArraySimple 
{
  //-------------------------------------------------------------
  //Μια επανάληψη της πιο βασικής δομής δεδομένων: των πινάκων!
  //-------------------------------------------------------------
	
  public static void main(String[] args) 
  {
      int [] array1 = {3, 1, 6, 7, 12};

      for (int i = 0; i < array1.length; i++)
      {
          System.out.println("Το " + (i+1) + "ο στοιχείο του πίνακα είναι: " + array1[i]);
      }
 }

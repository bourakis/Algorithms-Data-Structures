//-------------------------------------------------------------
//Μια επανάληψη της πιο βασικής δομής δεδομένων: των πινάκων!
//-------------------------------------------------------------
	
import java.util.Arrays;

public class ArraySimple 
{
	public static void main(String[] args) 
	{
		int [] array1 = {3, 1, 6, 7, 12};

		// 1ος τρόπος εμφάνισης των στοιχείων του Πίνακα
		for (int i = 0; i < array1.length; i++)
		{
			System.out.println("Το " + (i+1) + "ο στοιχείο του πίνακα είναι: " + array1[i]);
		}

		
		// 2ος τρόπος εμφάνισης των στοιχείων του Πίνακα
		int counter = 1;
		
		for (int j : array1)
		{
			System.out.println("Το " + (counter) + "ο στοιχείο του πίνακα είναι: " + j);
			counter++;
		}
	}
}

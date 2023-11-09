import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates 
{
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> inputList) 
  {
    	// Create a HashSet to store unique elements
    	HashSet<Integer> uniqueSet = new HashSet<>();
   	 
    	// Create a new ArrayList to store the result
    	ArrayList<Integer> resultList = new ArrayList<>();
   	 
    	// Iterate through the inputList
    	for (Integer num : inputList) 
      {
        	// If the element is not in the HashSet, add it to the resultList and HashSet
        	if (!uniqueSet.contains(num)) 
          {
            	resultList.add(num);
            	uniqueSet.add(num);
        	}
    	}
   	 
    	return resultList;
	}

	public static void main(String[] args) 
  {
    	ArrayList<Integer> inputList = new ArrayList<>();
    	inputList.add(1);
    	inputList.add(2);
    	inputList.add(2);
    	inputList.add(3);
    	inputList.add(4);
    	inputList.add(4);
    	inputList.add(5);

    	ArrayList<Integer> result = removeDuplicates(inputList);

    	System.out.println("Original ArrayList: " + inputList);
    	System.out.println("ArrayList with Duplicates Removed: " + result);
	}
}

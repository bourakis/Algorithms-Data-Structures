import java.util.ArrayList;

public class FindMaxElement 
{
	public static int findMax(ArrayList<Integer> inputList) 
  {
    	if (inputList.isEmpty()) 
      {
        	throw new IllegalArgumentException("Input list is empty.");
    	}
   	 
    	int max = inputList.get(0); // Initialize max to the first element
   	 
    	for (int num : inputList) 
      {
        	if (num > max) 
          {
            	max = num; // Update max if a larger element is found
        	}
    	}
   	 
    	return max;
	}

	public static void main(String[] args) 
  {
    	ArrayList<Integer> inputList = new ArrayList<>();
    	inputList.add(12);
    	inputList.add(45);
    	inputList.add(78);
    	inputList.add(32);
    	inputList.add(19);
    	inputList.add(67);

    	int maxElement = findMax(inputList);

    	System.out.println("Original ArrayList: " + inputList);
    	System.out.println("Maximum Element: " + maxElement);
	}
}

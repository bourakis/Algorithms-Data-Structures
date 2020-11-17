public class BooleanArrayPrint
{
	
	public static void main(String[] args) 
	{
		boolean[][] array = {{true, false, true},
				     {false, true, false}};
		printArray(array);
	}

	private static void printArray(boolean[][] array) 
	{
		for (int i = 0; i < array.length; i++) 
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				if (array[i][j]) 
				{
					System.out.print("*");
				} 
				else 
				{
					System.out.print(" ");
				}
			}

			System.out.println();
		}
	}
}

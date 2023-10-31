/*
Description: 
Here's the full Java code for finding the sum of even numbers in an array
*/

public class SumOfEvenNumbersInArray 
{
    public static void main(String[] args) 
    {
        int[] array = {12, 45, 6, 98, 24, 60, 31, 78, 10, 5};
        
        int sumOfEvens = 0;
        
        for (int number : array) 
        {
            if (number % 2 == 0) 
            {
                sumOfEvens += number;
            }
        }
        
        System.out.println("The sum of even numbers in the array is: " + sumOfEvens);
    }
}

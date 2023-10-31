/* 
---------------------------------------------------------------------------------
Author: Andreas V. Bourakis
Date: 31/10/2023
Description:
This program provides a menu-based interface for users to interact with the array, 
initialize it with random values, perform operations like sum, average, and 
searching, and even reverse the array. It continues running until the user 
chooses to exit.
---------------------------------------------------------------------------------
*/

import java.util.Scanner;
import java.util.Random;

public class ArrayManipulation 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = null;

        while (true) 
        {
            System.out.println("Menu:");
            System.out.println("1. Initialize an array");
            System.out.println("2. Print the array");
            System.out.println("3. Find the sum of all elements");
            System.out.println("4. Find the average of all elements");
            System.out.println("5. Reverse the array");
            System.out.println("6. Search for an element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the size of the array: ");
                    int size = scanner.nextInt();
                    array = new int[size];
                    for (int i = 0; i < size; i++) 
                    {
                        array[i] = random.nextInt(100); // Fill the array with random integers
                    }
                    System.out.println("Array initialized with random values.");
                    break;

                case 2:
                    if (array != null) 
                    {
                        System.out.print("Array elements: ");
                        for (int value : array) {
                            System.out.print(value + " ");
                        }
                        System.out.println();
                    } 
                    else 
                    {
                        System.out.println("Array is not initialized. Please choose option 1 to initialize it.");
                    }
                    break;

                case 3:
                    if (array != null) 
                    {
                        int sum = 0;
                        
                        for (int value : array) 
                        {
                            sum += value;
                        }
                        
                        System.out.println("Sum of all elements: " + sum);
                    } 
                    else 
                    {
                        System.out.println("Array is not initialized. Please choose option 1 to initialize it.");
                    }
                    break;

                case 4:
                    if (array != null) 
                    {
                        int sum = 0;
                        
                        for (int value : array) 
                        {
                            sum += value;
                        }
                        
                        double average = (double) sum / array.length;
                        System.out.println("Average of all elements: " + average);
                    } 
                    else 
                    {
                        System.out.println("Array is not initialized. Please choose option 1 to initialize it.");
                    }
                    break;

                case 5:
                    if (array != null) 
                    {
                        for (int i = 0; i < array.length / 2; i++)
                        {
                            int temp = array[i];
                            array[i] = array[array.length - 1 - i];
                            array[array.length - 1 - i] = temp;
                        }
                        
                        System.out.println("Array reversed.");
                    } 
                    else 
                    {
                        System.out.println("Array is not initialized. Please choose option 1 to initialize it.");
                    }
                    break;

                case 6:
                    if (array != null) 
                    {
                        System.out.print("Enter the element to search for: ");
                        int searchElement = scanner.nextInt();
                        int index = -1;

                        for (int i = 0; i < array.length; i++) 
                        {
                            if (array[i] == searchElement) 
                            {
                                index = i;
                                break;
                            }
                        }

                        if (index != -1) 
                        {
                            System.out.println("Element " + searchElement + " found at index " + index);
                        } 
                        else 
                        {
                            System.out.println("Element " + searchElement + " not found in the array.");
                        }
                    } 
                    else 
                    {
                        System.out.println("Array is not initialized. Please choose option 1 to initialize it.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting the program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option (1-7).");
                    break;
            }
        }
    }
}

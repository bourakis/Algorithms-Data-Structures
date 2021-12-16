
package stackinteger;

import java.util.Stack;

public class StackInteger 
{

    public static void main(String[] args) 
    {
        // Θέλω να φτιάξω ενα object τύπου Stack που να δέχεται Integer

        Stack<Integer> stackOfNumbers = new Stack<>();

        for (int i=1; i<=5; i++)
        {
            stackOfNumbers.push(i);
        }

        System.out.println("Το stack είναι: " + stackOfNumbers);
        System.out.println(stackOfNumbers.pop());
        System.out.println("Το stack είναι: " + stackOfNumbers);
    }
}

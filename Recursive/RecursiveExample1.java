// A Java program to demonstrate working of
// recursion

public class RecursiveExample1
{
    public static void printFun(int test)
    {
        if (test < 1)
            return;
        else
        {
            System.out.printf("%d ", test);
            printFun(test - 1); // statement 2

            System.out.printf("%d ", test);

            return;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int test = 3;
        printFun(test);
    }
}

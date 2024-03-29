package testbubblesort;

public class TestBubbleSort 
{

    public static void main(String[] args) 
    {
        int[] w = {7, 19, 24, 13, 8, 17, 11};

        bubbleSort(w);

        for (int i=0; i<w.length; i++)
        {
            System.out.println(w[i]);
        }
    }
    
    public static void bubbleSort(int[] arr)
    {
        // ?γιατί δε χρειάζεται να επιστρέψω κάτι από τη μέθοδο? (βάζω void)
        // HINT: pass by value και pass by reference

        int size = arr.length;
        int temp;

        for (int i=0; i<size; i++)
        {
            for (int j=1; j<(size-i); j++)
            {
                if (arr[j-1]  > arr[j])
                {
                    // κάνε swap τις δύο τιμές
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    } 
}

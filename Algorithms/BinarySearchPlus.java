public class BinarySearchPlus
{
    public static void main(String[] args) 
    {
        int[] myArray = {8, 22, 90, 5, 15, 54, 3, 23, 7, 2};
        
        int t =  3;

        bubbleSort (myArray);


        int thesi = binarySearch(myArray, t);

        if (thesi == -1)
        {
            System.out.println("το στοιχείο " + t + " δε βρέθηκε");
        }
        else
        {
            System.out.println("το στοιχείο " + t + " βρέθηκε σστη θέση " + thesi);
        }
    }

    public static void bubbleSort (int[] pin)
    {
        int size = pin.length;
        int temp;
        boolean did_swap=false;

        for (int i=0; i<size; i++)
        {
            for (int j=1; j<(size-i); j++)
            {
                if (pin[j-1] > pin[j])
                {
                    temp = pin[j-1];
                    pin[j-1] = pin[j];
                    pin[j] = temp;
                    did_swap = true;
                }

            }

            if (did_swap==false)
                break;
        }


    }

    public static int binarySearch(int[] A, int target)
    {
        int left = 0;
        int size = A.length;
        int right = size-1;
        int found = -1;
        int mid;

        while (found == -1 && left <= right)
        {
            // το while θα συνεχίζεται όσο δεν έχω βρει το στοιχείο που
            // ψαχνω (όσο το found είναι ίσο με -1)και όσο δεν μου έχουν
            // τελειώσει τα στοιχεία του πίνακα (δηλ το left δεν έχει γίνει
            // μεγαλύτερο από το right

            mid = (left + right) / 2;

            if (target < A[mid])
            {
                right = mid - 1;
            }
            else if (target > A[mid])
            {
                left = mid + 1;
            }
            else
                found = mid;
        }

        return found;

    }
}

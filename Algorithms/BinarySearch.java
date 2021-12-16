
package testbinarysearch;

public class TestBinarySearch 
{
    public static void main(String[] args) 
    {
        int[] myArray = {-31, -22, 1, 3, 6, 8, 9, 10, 17, 23};
      
        int t =  1;
      
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
    
    public static int binarySearch(int[] A, int target)
    {
        int left = 0;
        int size = A.length;
        int right = size-1;
        int found = -1;
        int mid;
      
        while (found == -1 && left<=right)
        {
            // το while θα συνεχίζεται όσο δεν έχω βρει το στοιχείο που
            // ψαχνω (όσο το found είναι ίσο με -1)και όσο δεν μου έχουν 
            // τελειώσει τα στοιχεία του πίνακα (δηλ το left δεν έχει γίνει 
            // μεγαλύτερο από το right
            mid = (left + right) / 2;
            
            if (target < A[mid] )
            {
                right  = mid - 1;
            }
            else if (target > A[mid])
            {
                left =   mid + 1;
            }
            else
                found = mid;
        }
      
        return found;
            
    }
}

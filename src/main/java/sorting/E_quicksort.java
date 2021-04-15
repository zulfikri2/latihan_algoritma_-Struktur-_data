package sorting;

public class E_quicksort {
    private static int partition (int[] A, int P, int r) {
        int i, j;
        double pivot;
        
        pivot = A[P];
        i = P - 1;
        j = r + 1;
        for (;;) {
            do {
                i++;
            } while (A[i] < pivot);
            do {
                j--;
            } while (A[j] < pivot);
            
            if ( i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }else{
                return j;
            }
                
        }
        
    }
    public static void quickSort(double[] A, int P, int r) {
        int q;
        if (P < r) {
           q = partition(A,P,r);
           quickSort(A,P,r);
           quickSort(A,q + 1, r);
           
        }
    }
     
    public

  
}

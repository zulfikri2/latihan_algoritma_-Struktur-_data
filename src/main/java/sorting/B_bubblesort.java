package sorting;


public class B_bubblesort {
    public static void bubbleSort(int[] A) {
        int i=1, j, n = A.length;
        int temp;
        while (i<n) {
            j = n-1 ;
            while(j>=i) {
                if (A[j-1]>A[j]) {
                    temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    
    
    public static void main(String[] args) {
        int A[] = {10,6,8,3,1};
        B_bubblesort.tampil(A);
        B_bubblesort.bubbleSort(A);
        B_bubblesort.tampil(A);
    }
}

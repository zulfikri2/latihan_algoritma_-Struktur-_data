package sorting;

public class A_insertionsort {
    public static void insertionSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i -1;
            while ((j >= 0) && (A[j] > key)) {
                
                
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int A[] = {3, 10, 4, 2, 8, 9, 7, 6};
        A_insertionsort.tampil(A);
        A_insertionsort.insertionSort(A);
        A_insertionsort.tampil(A);
    }
}

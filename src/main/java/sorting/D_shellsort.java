package sorting;

public class D_shellsort {
   public static void ShellSort(int[] arr)  {
       int n = arr.length;
       int C,M ;
       int jarak, i, j, kondisi;
       boolean Sudah = true;
       int temp ;
       C = 0;
       M = 0;
       jarak = n;
       
       while ( jarak >= 1) {
           jarak = jarak / 2;
           Sudah = true;
           while (Sudah) {
               Sudah = false;
               for (j = 0; j < n - jarak; j++) {
                   i = j + jarak;
                   C++;
                   if (arr[j]> arr[i]) {
                       temp = arr[j];
                       arr[j] = arr[i];
                       arr[i] = temp;
                       Sudah = true;
                   }
               }
           }
       }
   }
   public static void tampil(int data[]) {
       for(int i=0;i<data.length;i++) 
           System.out.print(data[i]+ " ");
       System.out.println();
   }
   
   
   public static void main(String[] args) {
       int A[] = {12,35,9,11,3,17,23,15,31,20};
       D_shellsort.tampil(A);
       D_shellsort.ShellSort(A);
       D_shellsort.tampil(A);
   }
}
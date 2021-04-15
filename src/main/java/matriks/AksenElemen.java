package matriks;


public class AksenElemen {
    
public static void main (String[] args) {
      int matrix [][] = new int [2][2];
        matrix [0][0] = 1;
        matrix [0][1] = 2;
        matrix [1][0] = 4;
        matrix [1][1] = 5;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println(matrix[1][0]);
              System.out.println();
        System.out.println("Muhammad zulfikri");
    }
    }



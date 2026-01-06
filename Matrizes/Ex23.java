import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] A = new double[3][3];
        double[][] B = new double[3][3];
        
        System.out.println("Matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextDouble();
            }
        }
        
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = 0;
                for (int k = 0; k < A[i].length; k++) {
                    B[i][j] += A[i][k] * A[k][j];
                }
            }
        }
        
        System.out.println("Matriz B = A^2:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
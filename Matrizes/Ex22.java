import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] A = new double[3][3];
        double[][] B = new double[3][3];
        double[][] C = new double[3][3];
        
        System.out.println("Matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextDouble();
            }
        }
        
        System.out.println("Matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextDouble();
            }
        }
        
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A[i].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        System.out.println("Matriz C = A * B:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
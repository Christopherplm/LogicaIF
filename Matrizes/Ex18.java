import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] somaDasColunas = new int[3];

        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < matriz[0].length; j++) {
            int somaAtual = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaAtual += matriz[i][j];
            }
            
            somaDasColunas[j] = somaAtual;
        }

        System.out.println("\nSomas (Coluna 0, Coluna 1, Coluna 2):");
        for (int i = 0; i < somaDasColunas.length; i++) {
            System.out.print(somaDasColunas[i] + " ");
        }
        
        scanner.close();
    }
}
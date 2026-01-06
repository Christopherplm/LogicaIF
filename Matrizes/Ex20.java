import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] matriz = new double[3][6];
        
        System.out.println("--- Gerando Matriz 3x6 com números aleatórios ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Math.random() * 100;
            }
        }
        
        System.out.println("\nMatriz Original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
        
        // Soma dos elementos das colunas ímpares (índices 1, 3, 5)
        double somaImpares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j % 2 != 0) {
                    somaImpares += matriz[i][j];
                }
            }
        }
        
        // Média da segunda e quarta colunas (índices 1 e 3)
        double somaSegundaQuarta = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaSegundaQuarta += matriz[i][1];
            somaSegundaQuarta += matriz[i][3];
        }
        double media = somaSegundaQuarta / (matriz.length * 2);
        
        // Modifica a sexta coluna (índice 5) com a soma da primeira e segunda
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][5] = matriz[i][0] + matriz[i][1];
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.printf("Soma dos elementos das colunas impares: %.2f\n", somaImpares);
        System.out.printf("Media aritmetica dos elementos da segunda e quarta colunas: %.2f\n", media);
        
        System.out.println("\nMatriz Modificada (6ª coluna alterada):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
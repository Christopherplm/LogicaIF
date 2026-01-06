import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] =(int)(Math.random()* 10); // 0 a 10
                matriz2[i][j] =(int)(Math.random()* 10);
            }
        }
        System.out.println("\nMatriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print( matriz2[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\n--- Menu ---");
        System.out.println("1 - Somar as duas matrizes");
        System.out.println("2 - Subtrair a primeira matriz da segunda");
        System.out.println("3 - Adicionar uma constante as duas matrizes");
        System.out.println("4 - Imprimir as matrizes");
        System.out.print("Opcao: ");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            int[][] matriz3 = new int[2][2];
            for (int i = 0; i < matriz3.length; i++) {
                for (int j = 0; j < matriz3[i].length; j++) {
                    matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }
            System.out.println("\nResultado da soma:");
            for (int i = 0; i < matriz3.length; i++) {
                for (int j = 0; j < matriz3[i].length; j++) {
                    System.out.print( matriz3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 2) {
            int[][] matriz3 = new int[2][2];
            for (int i = 0; i < matriz3.length; i++) {
                for (int j = 0; j < matriz3[i].length; j++) {
                    matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
                }
            }
            System.out.println("\nResultado da subtracao:");
            for (int i = 0; i < matriz3.length; i++) {
                for (int j = 0; j < matriz3[i].length; j++) {
                    System.out.printf( matriz3[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 3) {
            System.out.print("Digite a constante: ");
            int constante = scanner.nextInt();
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    matriz1[i][j] += constante;
                    matriz2[i][j] += constante;
                }
            }
            System.out.println("\nConstante adicionada as matrizes: " + constante);
            
            // Exibe as matrizes modificadas
            System.out.println("\nMatriz 1 (modificada):");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    System.out.printf( matriz1[i][j] + " ");
                }
                System.out.println();
            }
            
            System.out.println("\nMatriz 2 (modificada):");
            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    System.out.printf( matriz2[i][j] + " ");
                }
                System.out.println();
            }
        } else if (opcao == 4) {
            System.out.println("\nMatriz 1:");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[i].length; j++) {
                    System.out.printf( matriz1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nMatriz 2:");
            for (int i = 0; i < matriz2.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    System.out.printf( matriz2[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nOpcao invalida!");
        }
        
        scanner.close();
    }
}
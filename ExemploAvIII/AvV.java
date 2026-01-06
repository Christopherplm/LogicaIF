package ExemploAvIII;
import java.util.Scanner;

public class AvV {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // PASSO 1: Criar os dois vetores de 10 posições
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        
        // PASSO 2: Ler os 10 valores para v1
        System.out.println("Digite 10 valores para o vetor V1:");
        for (int i = 0; i < v1.length; i++) {
            System.out.print("V1[" + i + "]: ");
            v1[i] = in.nextInt();
        }
        
        // PASSO 3: Calcular a soma acumulada para v2
        // Para cada posição de v2, somar TODOS os elementos de v1 até aquele índice
        for (int i = 0; i < v2.length; i++) {
            int soma = 0;
            
            // Somar todos os valores de v1 desde o índice 0 até i
            for (int j = 0; j <= i; j++) {
                soma = soma + v1[j];
            }
            
            // Armazenar a soma em v2[i]
            v2[i] = soma;
        }
        
        // PASSO 4: Exibir os resultados
        System.out.println("\n=== RESULTADO ===\n");
        
        System.out.println("Vetor V1:");
        for (int i = 0; i < v1.length; i++) {
            System.out.println("V1[" + i + "] = " + v1[i]);
        }
        
        System.out.println("\nVetor V2 (soma acumulada):");
        for (int i = 0; i < v2.length; i++) {
            System.out.print("V2[" + i + "] = " + v2[i] + " (");
            
            // Mostrar o cálculo que foi feito
            for (int j = 0; j <= i; j++) {
                System.out.print(v1[j]);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(")");
        }
        
        in.close();
    }
}
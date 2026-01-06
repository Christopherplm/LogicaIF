package ExemploAvIII;
import java.util.Scanner;


public class AvIV {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // PASSO 1: Perguntar quantos números serão digitados
        System.out.print("Quantos números você deseja digitar? ");
        int quantidade = in.nextInt();
        
        // PASSO 2: Criar o vetor com o tamanho informado
        int[] vetor = new int[quantidade];
        
        // PASSO 3: Ler os números do usuário
        System.out.println("\nDigite os " + quantidade + " números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = in.nextInt();
        }
        
        // PASSO 4: Contar quantos pares e ímpares existem
        int contPares = 0;
        int contImpares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                contPares++;
            } else {
                contImpares++;
            }
        }
        
        // PASSO 5: Criar vetores separados para pares e ímpares
        int[] pares = new int[contPares];
        int[] impares = new int[contImpares];
        
        // PASSO 6: Separar os números pares e ímpares
        int indicePares = 0;
        int indiceImpares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                pares[indicePares] = vetor[i];
                indicePares++;
            } else {
                impares[indiceImpares] = vetor[i];
                indiceImpares++;
            }
        }
        
        // PASSO 7: Ordenar pares em ordem CRESCENTE (Bubble Sort)
        for (int i = 0; i < pares.length - 1; i++) {
            for (int j = 0; j < pares.length - 1 - i; j++) {
                if (pares[j] > pares[j + 1]) {
                    // Trocar elementos
                    int temp = pares[j];
                    pares[j] = pares[j + 1];
                    pares[j + 1] = temp;
                }
            }
        }
        
        // PASSO 8: Ordenar ímpares em ordem DECRESCENTE (Bubble Sort)
        for (int i = 0; i < impares.length - 1; i++) {
            for (int j = 0; j < impares.length - 1 - i; j++) {
                if (impares[j] < impares[j + 1]) {
                    // Trocar elementos
                    int temp = impares[j];
                    impares[j] = impares[j + 1];
                    impares[j + 1] = temp;
                }
            }
        }
        
        // PASSO 9: Exibir o resultado final
        System.out.println("\n=== RESULTADO ===");
        System.out.println("\nVetor original:");
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println("\nVetor organizado:");
        System.out.print("[");
        
        // Primeiro imprime os pares
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i]);
            if (i < pares.length - 1 || impares.length > 0) {
                System.out.print(", ");
            }
        }
        
        // Depois imprime os ímpares
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i]);
            if (i < impares.length - 1) {
                System.out.print(", ");
            }
        }
        
        System.out.println("]");
        
        in.close();
    }
}
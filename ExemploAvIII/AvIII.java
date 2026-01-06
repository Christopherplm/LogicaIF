package ExemploAvIII;

import java.util.Scanner;

public class AvIII {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // PASSO 1: Criar os três vetores
        int[] v1 = new int[5];  // Primeiro vetor
        int[] v2 = new int[5];  // Segundo vetor
        int[] v3 = new int[10]; // Vetor final mesclado
        
        // PASSO 2: Ler os 5 valores do primeiro vetor
        System.out.println("Digite os 5 valores do PRIMEIRO vetor (em ordem crescente):");
        for (int i = 0; i < v1.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v1[i] = in.nextInt();
        }
        
        // PASSO 3: Ler os 5 valores do segundo vetor
        System.out.println("\nDigite os 5 valores do SEGUNDO vetor (em ordem crescente):");
        for (int i = 0; i < v2.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            v2[i] = in.nextInt();
        }
        
        // PASSO 4: Mesclar os dois vetores mantendo a ordem
        // Usar três índices: i para v1, j para v2, k para v3
        int i = 0;  // índice do v1
        int j = 0;  // índice do v2
        int k = 0;  // índice do v3
        
        // PASSO 5: Enquanto houver elementos em ambos os vetores
        while (i < v1.length && j < v2.length) {
            if (v1[i] < v2[j]) {
                // Se elemento de v1 é menor, copia v1 para v3
                v3[k] = v1[i];
                i++;  // avança no v1
            } else {
                // Se elemento de v2 é menor ou igual, copia v2 para v3
                v3[k] = v2[j];
                j++;  // avança no v2
            }
            k++;  // sempre avança no v3
        }
        
        // PASSO 6: Copiar elementos restantes do v1 (se houver)
        while (i < v1.length) {
            v3[k] = v1[i];
            i++;
            k++;
        }
        
        // PASSO 7: Copiar elementos restantes do v2 (se houver)
        while (j < v2.length) {
            v3[k] = v2[j];
            j++;
            k++;
        }
        
        // PASSO 8: Exibir os resultados
        System.out.println("\nPrimeiro vetor (v1):");
        System.out.print("[");
        for (int x = 0; x < v1.length; x++) {
            System.out.print(v1[x]);
            if (x < v1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println("\nSegundo vetor (v2):");
        System.out.print("[");
        for (int x = 0; x < v2.length; x++) {
            System.out.print(v2[x]);
            if (x < v2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println("\nVetor final mesclado (v3):");
        System.out.print("[");
        for (int x = 0; x < v3.length; x++) {
            System.out.print(v3[x]);
            if (x < v3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        in.close();
    }
}
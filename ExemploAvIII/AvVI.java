package ExemploAvIII;
import java.util.Scanner;

public class AvVI {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // PASSO 1: Ler o número de linhas (N deve ser > 2)
        System.out.print("Digite o número de linhas do Triângulo de Pascal (N > 2): ");
        int n = in.nextInt();
        
        // Validação
        if (n <= 2) {
            System.out.println("N deve ser maior que 2!");
            in.close();
            return;
        }
        
        System.out.println("\nTriângulo de Pascal com " + n + " linhas:\n");
        
        // PASSO 2: Criar a primeira linha (sempre começa com [1])
        int[] linhaAtual = new int[1];
        linhaAtual[0] = 1;
        
        // Imprimir a primeira linha
        System.out.print("Linha 1: ");
        for (int i = 0; i < linhaAtual.length; i++) {
            System.out.print(linhaAtual[i] + " ");
        }
        System.out.println();
        
        // PASSO 3: Gerar e imprimir as próximas N-1 linhas
        for (int linha = 2; linha <= n; linha++) {
            
            // PASSO 4: Criar nova linha (tamanho aumenta em 1 a cada linha)
            int[] novaLinha = new int[linha];
            
            // PASSO 5: Primeira posição sempre é 1
            novaLinha[0] = 1;
            
            // PASSO 6: Última posição sempre é 1
            novaLinha[novaLinha.length - 1] = 1;
            
            // PASSO 7: Calcular os valores do meio
            // Cada elemento é a soma de dois elementos da linha anterior
            for (int i = 1; i < novaLinha.length - 1; i++) {
                novaLinha[i] = linhaAtual[i - 1] + linhaAtual[i];
            }
            
            // PASSO 8: Imprimir a linha atual
            System.out.print("Linha " + linha + ": ");
            for (int i = 0; i < novaLinha.length; i++) {
                System.out.print(novaLinha[i] + " ");
            }
            System.out.println();
            
            // PASSO 9: A nova linha se torna a linha atual para a próxima iteração
            linhaAtual = novaLinha;
        }
        
        in.close();
    }
}
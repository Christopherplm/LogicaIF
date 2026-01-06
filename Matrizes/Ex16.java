import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char[] gabarito = new char[10];
        char[][] respostas = new char[3][10];
        int[] matriculas = new int[3];
        int[] notas = new int[3];
        
        System.out.println("Digite o gabarito:");
        for (int i = 0; i < gabarito.length; i++) {
            System.out.print("Questao " + (i + 1) + ": ");
            gabarito[i] = entrada.next().charAt(0);
        }
        
        for (int i = 0; i < respostas.length; i++) {
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.print("Matricula: ");
            matriculas[i] = entrada.nextInt();
            
            for (int j = 0; j < respostas[i].length; j++) {
                System.out.print("Questao " + (j + 1) + ": ");
                respostas[i][j] = entrada.next().charAt(0);
            }
        }
        
        for (int i = 0; i < notas.length; i++) {
            notas[i] = 0;
            for (int j = 0; j < gabarito.length; j++) {
                if (respostas[i][j] == gabarito[j]) {
                    notas[i]++;
                }
            }
        }
        
        System.out.println("\nResultados:");
        for (int i = 0; i < matriculas.length; i++) {
            System.out.println("\nMatricula: " + matriculas[i]);
            System.out.print("Respostas: ");
            for (int j = 0; j < respostas[i].length; j++) {
                System.out.print(respostas[i][j] + " ");
            }
            System.out.println("\nNota: " + notas[i]);
        }
        
        int aprovados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7) {
                aprovados++;
            }
        }
        
        double percentual = (aprovados * 100.0) / respostas.length;
        System.out.println("\nPercentual de aprovacao: " + percentual + "%");
        
        entrada.close();
    }
}
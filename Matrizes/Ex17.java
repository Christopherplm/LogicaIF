import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] notas = new double[10][3];
        
        int piorProva1 = 0;
        int piorProva2 = 0;
        int piorProva3 = 0;

        System.out.println("Digite as notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota da Prova " + (j + 1) + ": ");
                notas[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            
            int indicePiorNota = 0; 

            if (notas[i][1] < notas[i][indicePiorNota]) {
                indicePiorNota = 1;
            }

            if (notas[i][2] < notas[i][indicePiorNota]) {
                indicePiorNota = 2;
            }

            if (indicePiorNota == 0) {
                piorProva1++;
            } else if (indicePiorNota == 1) {
                piorProva2++;
            } else {
                piorProva3++;
            }
        }

        System.out.println("\nDesempenho das provas: ");
        System.out.println("Número de alunos com a pior nota na Prova 1: " + piorProva1);
        System.out.println("Número de alunos com a pior nota na Prova 2: " + piorProva2);
        System.out.println("Número de alunos com a pior nota na Prova 3: " + piorProva3);

        entrada.close();
    }
}
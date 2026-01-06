import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] dadosAlunos = new int[5][4];
        
        for (int i = 0; i < dadosAlunos.length; i++) {
            System.out.print("Matricula: ");
            dadosAlunos[i][0] = scanner.nextInt();
            
            System.out.print("Media das provas: ");
            dadosAlunos[i][1] = scanner.nextInt();
            
            System.out.print("Media dos trabalhos: ");
            dadosAlunos[i][2] = scanner.nextInt();
            
            dadosAlunos[i][3] = dadosAlunos[i][1] + dadosAlunos[i][2];
        }
        
        int maiorNota = dadosAlunos[0][3];
        int matriculaMaior = dadosAlunos[0][0];
        int soma = 0;
        
        for (int i = 0; i < dadosAlunos.length; i++) {
            if (dadosAlunos[i][3] > maiorNota) {
                maiorNota = dadosAlunos[i][3];
                matriculaMaior = dadosAlunos[i][0];
            }
            soma += dadosAlunos[i][3];
        }
        
        double media = (double) soma / dadosAlunos.length;
        
        System.out.println("Matricula com maior nota final: " + matriculaMaior);
        System.out.println("Media aritmetica das notas finais: " + media);
        
        scanner.close();
    }
}
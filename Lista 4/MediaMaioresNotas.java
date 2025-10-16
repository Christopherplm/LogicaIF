import java.util.Scanner;

public class MediaMaioresNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double menorNota;
        double somaNotas;
        double media;
        
        System.out.print("Digite a primeira nota: ");
        nota1 = in.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = in.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = in.nextDouble();
        
        somaNotas = nota1 + nota2 + nota3;
        
        // Descobrir qual é a menor nota usando 3 comandos if
        menorNota = nota1;
        
        if (nota2 < menorNota) {
            menorNota = nota2;
        }
        
        if (nota3 < menorNota) {
            menorNota = nota3;
        }
        
        // Subtrair a menor nota da soma total e dividir por 2
        media = (somaNotas - menorNota) / 2;
        
        System.out.println("\nNotas informadas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Menor nota (descartada): " + menorNota);
        System.out.println("Média das duas maiores notas: " + media);
        
        in.close();
    }
}
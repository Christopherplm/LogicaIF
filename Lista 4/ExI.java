import java.util.Scanner;

public class ExI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int soma = 0; 

        System.out.println("Digite um número inteiro: ");
            int numero = in.nextInt();

        for (int i = 1; i <= numero; i++){
            System.out.println(i);
            soma = soma + i; 
        }
        
        System.out.println("A soma de 1 até " + numero + " é: " + soma);
        in.close();
    }
}

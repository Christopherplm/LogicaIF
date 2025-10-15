import java.util.Scanner;

public class ExII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int soma = 0; 

        System.out.println("Digite um número inteiro positivo. O programa irá somar todos os números PARES de 2 até esse valor: ");
            int number = in.nextInt();

        for(int i = 2; i <= number; i+= 2 ){
            System.out.println(i);
            soma = soma + i;
        }

        System.out.println("O resultado da soma dos números pares de 2 até " + number + " é : " + soma);
        
        in.close();
    }
}

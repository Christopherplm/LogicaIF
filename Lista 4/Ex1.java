import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int contador = 1;
        int soma = 0 ;


        System.out.println("Digite um número inteiro positivo. O programa irá somar todos os números de 1 até esse valor:");
            int number = in.nextInt();

        System.out.print("Somando: ");
            while (contador <= number) {
                System.out.print(contador);
                soma = soma + contador;
                if (contador < number) {
                    System.out.print(" + ");
                }
                contador++;
            }
        System.out.println();
        System.out.println("O resultado da soma de 1 até " + number + " é: " + soma);
    }
}

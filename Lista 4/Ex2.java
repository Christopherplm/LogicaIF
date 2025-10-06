import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int contador = 2;
        int soma = 0;

        System.out.println("Digite um número inteiro positivo. O programa irá somar todos os números PARES de 2 até esse valor:");
            int number = in.nextInt();

        System.out.print("Somando: ");
            while (contador <= number) {
                System.out.print(contador);
                soma = soma + contador;
                    if (contador + 2 <= number) {
                        System.out.print(" + ");
                }
                contador += 2;
            }

        System.out.println();
        System.out.println("O resultado da soma dos números pares de 2 até " + number + " é: " + soma);
    }
}
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro para saber se ele é primo ou não:");
        int number = in.nextInt();

        int contador = 1;
        int divisores = 0;

        while ( contador <= number){
            if (number % contador == 0){
                divisores++;
            }
            contador++;
        }

        if (divisores == 2) {
            System.out.println(number + " É primo");
        } else {
            System.out.println(number + " Não é primo");
        }
        in.close();

    }   
}


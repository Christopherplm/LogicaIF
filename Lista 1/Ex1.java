import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);   

        int numero, antecessor;

        System.out.println("Digite um número inteiro para saber o seu antecessor: ");
        numero = in.nextInt();

        antecessor = numero - 1; 

        System.out.println("O antecessor de " + numero + " é: " + antecessor);

        in.close();
    }
}
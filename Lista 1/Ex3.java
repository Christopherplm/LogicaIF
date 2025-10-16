import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;
        System.out.println("Digite um número inteiro para saber o seu valor ao quadrado: ");

        valor = in.nextInt();

        System.out.println("O valor ao quadrado de: " + valor + " é: " + (valor * valor));
        in.close();

    }
}

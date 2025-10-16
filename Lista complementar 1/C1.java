import java.util.Scanner;

public class C1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int numero; 

        System.out.println("Digite um número inteiro para saber se ele é positivo, negativo ou zero");
        numero = in.nextInt();

            if (numero > 0) {
                System.out.println("Numero positivo");
            } else if ( numero < 0) {
                System.out.println("Número negativo");
            }else {
                System.out.println("Zero");
            }
        in.close();
    }
}

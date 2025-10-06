import java.util.Scanner;

public class C3 {
    public static void main(String[] argas) {
        Scanner in = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número para sabe se é par ou impar");
        numero = in.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Numero par");
        }else {
            System.out.println("Número impar");
        }
    }

}

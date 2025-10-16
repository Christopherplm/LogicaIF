import java.util.Scanner;

public class MultiploCinco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int valor;
        int resto;
        
        System.out.print("Digite um valor inteiro: ");
        valor = in.nextInt();
        resto = valor % 5;
        
        while (resto != 0) {
            System.out.println("O valor " + valor + " não é múltiplo de 5!");
            System.out.print("Digite um valor inteiro: ");
            valor = in.nextInt();
            resto = valor % 5;
        }
        
        System.out.println("O valor " + valor + " é múltiplo de 5! Programa encerrado.");
        
        in.close();
    }
}
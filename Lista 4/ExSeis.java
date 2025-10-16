import java.util.Scanner;

public class ExSeis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int valor;
        
        for (valor = 0; valor < 1 || valor > 10;) {
            System.out.print("Digite um valor entre 1 e 10: ");
            valor = in.nextInt();
            
            if (valor < 1 || valor > 10) {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }
        
        System.out.println("Valor lido: " + valor);
            in.close();
        
    }
}
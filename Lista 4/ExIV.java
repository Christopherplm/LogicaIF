import java.util.Scanner;

public class ExIV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        char opcao = ' ';
        float saldo = 0, valor;

        while (opcao != 'd') {
            System.out.println("\n=== MENU ===");
            System.out.println("a - Consultar saldo");
            System.out.println("b - Saque");
            System.out.println("c - Depósito");
            System.out.println("d - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = in.next().charAt(0);
            
            
        }
        
        in.close();
    }
}
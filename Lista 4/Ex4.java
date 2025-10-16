import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in); 

         char opcao = ' ';
         float saldo = 0, valor;


         while (opcao != 'd') {
            System.out.println("a - consultar saldo\nb - saque\nc - deposito\nd - sair ");
            opcao = in.next().charAt(0);
            
                if(opcao == 'a') {
                    System.out.println(saldo);
                }else if (opcao =='b'){
                    System.out.println("valor de saque?");
                    valor = in.nextFloat();
                    saldo = saldo - valor; 
                }else if (opcao == 'c'){
                    System.out.println("Valor de deposito");
                    valor = in.nextFloat();
                    saldo = saldo + valor; 
                }else if(opcao == 'd'){
                    System.out.println("Saindo...");
                }else{
                    System.out.println("Letra inválida.");
                }
        in.close();

         }
    }
}
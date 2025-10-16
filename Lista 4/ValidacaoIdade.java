import java.util.Scanner;

public class ValidacaoIdade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int idade;
        
        System.out.print("Digite sua idade: ");
        idade = in.nextInt();
        
        while (idade <= 0 || idade >= 150) {
            System.out.println("Idade inválida! A idade deve ser maior que 0 e menor que 150.");
            System.out.print("Digite sua idade: ");
            idade = in.nextInt();
        }
        
        System.out.println("Idade lida: " + idade);
        
        in.close();
    }
}
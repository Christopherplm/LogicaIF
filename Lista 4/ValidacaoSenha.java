import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int senha;
        int senhaCorreta = 12345;
        int tentativas = 0;
        
        System.out.print("Digite a senha: ");
        senha = in.nextInt();
        tentativas++;
        
        while (senha != senhaCorreta) {
            System.out.println("Senha incorreta! Tente novamente.");
            System.out.print("Digite a senha: ");
            senha = in.nextInt();
            tentativas++;
        }
        
        System.out.println("Senha correta!");
        System.out.println("Número de tentativas: " + tentativas);
        
        in.close();
    }
}
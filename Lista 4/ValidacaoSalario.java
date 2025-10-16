import java.util.Scanner;

public class ValidacaoSalario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salario;
        double salarioMinimo = 1412.00; 
        double salarioMaximo = 100000.00;
        
        System.out.print("Digite o salário: R$ ");
        salario = in.nextDouble();
        
        while (salario < salarioMinimo || salario > salarioMaximo) {
            System.out.println("Salário inválido!");
            System.out.println("O salário deve ser maior ou igual a R$ " + salarioMinimo + " e menor ou igual a R$ " + salarioMaximo);
            System.out.print("Digite o salário: R$ ");
            salario = in.nextDouble();
        }
        
        System.out.println("Salário lido: R$ " + salario);
        
        in.close();
    }
}
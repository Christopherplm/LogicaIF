import java.util.Scanner;

public class DivisaoValores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double valor1;
        double valor2;
        double resultado;
        
        System.out.print("Digite o primeiro valor: ");
        valor1 = in.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        valor2 = in.nextDouble();
        
        while (valor2 == 0) {
            System.out.println("O segundo valor não pode ser ZERO!");
            System.out.print("Digite o segundo valor: ");
            valor2 = in.nextDouble();
        }
        
        resultado = valor1 / valor2;
        
        System.out.println("O resultado da divisão de " + valor1 + " por " + valor2 + " é: " + resultado);
        
        in.close();
    }
}
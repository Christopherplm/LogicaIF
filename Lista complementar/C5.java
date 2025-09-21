import java.util.Scanner;

public class C5 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);

        int resultado;

        System.out.println("Informe o primeiro número:");
        int num1 = in.nextInt();

        System.out.println("Informe o operador( +, -, * ou /):");
        String operador = in.next();

        System.out.println("Informe o primeiro número:");
        int num2 = in.nextInt();

        if (operador.equals("+")) {
            resultado = num1 + num2;
        } else if (operador.equals("-")) {
            resultado = num1 - num2;
        } else if (operador.equals("*")) {
            resultado = num1 * num2;
        } else if (operador.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: Divisão por zero!");
                in.close();
                return;
            }
        } else {
            System.out.println("Operador inválido!");
            in.close();
            return;
        }

        System.out.println("Resultado: " + resultado);
        in.close();
    }
}
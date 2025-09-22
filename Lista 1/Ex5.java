import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int celsius, fahrenheit;

        System.out.println("Insera o numero Fahrenheit para converter em Celsius");
        fahrenheit = in.nextInt();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Resultado de Fahrenheit para Celsius foi: " + celsius);
    }
}

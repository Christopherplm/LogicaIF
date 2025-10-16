import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base, altura;

        System.out.println("Para saber a area do seu triangulo, informe a base: ");
            base = in.nextInt();
        System.out.println("Informe a altura: ");
            altura = in.nextInt();
        // area = (base * altura) / 2.0;
        System.out.println("A area total do seu triangulo é: " + ((base * altura)  / 2));        
        in.close();
    }
}

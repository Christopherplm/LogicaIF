import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double av1, av2 , media;

        System.out.println("Insira a nota da sua primeira avaliação: ");
            av1 = in.nextDouble();
        System.out.println("Insira a nota da sua segunda avaliação: ");
            av2 = in.nextDouble();

        media = (av1 + av2) / 2;
        System.out.println("Sua média foi: " + media);
        in.close();
    }
}

import java.util.Scanner;

public class V3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva 10 valores: ");
        float [] v = new float[10];

        for (int i = 0; i < v.length; i++){
            System.out.println("Digite os valores: " + (i + 1) + ": ");
            float valores = in.nextFloat();
        }
    }   
}

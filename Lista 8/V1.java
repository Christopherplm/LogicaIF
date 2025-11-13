import java.util.Scanner;

public class V1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");

        int numeros = in.nextInt();
        int [] v = new int[numeros];

        System.out.println("Digite os " + numeros + " números.");
        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
        }

        System.out.println("\n Ordem inversa: ");
        for (int i = numeros - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
    }    
}

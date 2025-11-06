import java.util.Scanner;

public class AvEx3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite 3 números inteiros: ");

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        //a 
        if (a < b && b < c) {
            System.out.printf("%d %d %d", a, c, b);
        }
        if (a < c && c < b) {
            System.out.printf("%d %d %d", a, b, c);
        }
        
        //b
        if (b < a && a < c) {
            System.out.printf("%d %d %d", b, a, c);
        }
        if (b < c && c < a) {
            System.out.printf("%d %d %d", b, c, a);
        }

        //c
        if (c < a && a < b) {
            System.out.printf("%d %d %d", c, a, b);
        }
        if (c < b && b < a) {
            System.out.printf("%d %d %d", c, b, a);
        }

        in.close();
    }
}

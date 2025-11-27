package ExemploAvIII;

import java.util.Scanner;

public class AvII {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int v[] = new int[10];

        System.out.println("Digite os 10 valores: ");
        for(int i = 0; i < v.length; i++){
            System.out.println("Digite o " + (i + 1) + "º número: ");
            v[i] = in.nextInt();
        }
        
    }
}

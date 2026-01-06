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

        int menor = v[0];
        for(int i = 1; i < v.length; i++){
            if(v[i] < menor){
                menor = v[i];
            }
        }
        
        int maior = v[0];
        for(int i = 1; i < v.length; i++){
            if(v[i] > maior){
                maior = v[i];
            }
        }

        int contMenor = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i] == menor){
                contMenor++;
            }
        }

        int contMaior = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i] > maior){
                maior = v[i];
            }
        }

        System.out.println("\nVetor digitado:") ;
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        System.out.println("\nMenor valor: " + menor + " aparece " + contMenor );
        System.out.println("Maior valor: " + maior + " aparece " + contMaior );
    }
}

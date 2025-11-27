package ExemploAvIII;

import java.util.Scanner;

public class AvI {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
    
        int v[] = new int[10];
        int contador = 0;

        System.out.println("Digite os 10 números diferentes");

        while(contador < 10){
            System.out.println("Digite o " + (contador + 1) + "º número:");
            int numero = in.nextInt();

            boolean numExistente = false;

            for(int i = 0; i < contador; i++){
                if(v[i] == numero){
                    numExistente = true;
                }
            }

            if(numExistente){
                System.out.println("Número existente");
            }else{
                v[contador] = numero;
                contador++;
            }

            
        }
        System.out.println("\nVetor final: ");
            for(int j = 0; j < v.length; j++){
                System.out.println("Posição [" + j +"]: " + v[j]);
            }
    }
}

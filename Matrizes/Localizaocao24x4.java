package Matrizes;

public class Localizacao4x4 {
    public static void main(String[] args) {
        
        int [][] matriz = new int[4][4]; 

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 20) + 10;
            }
        }

        int maiorValor = matriz[0][0];

        // Primeiro loop: encontrar o maior valor
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { 
                if(matriz[i][j] > maiorValor){
                    maiorValor = matriz[i][j];
                }
            }
        }

        // Imprimir matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Segundo loop: contar e mostrar todas as posições do maior valor
        int contador = 0;
        System.out.println("\nMaior valor: " + maiorValor);
        System.out.println("Posições onde aparece:");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == maiorValor){
                    contador++;
                    System.out.println("  - Linha " + i + ", Coluna " + j);
                }
            }
        }
        
        System.out.println("\nTotal de aparições: " + contador);
    }
}
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
        int maiorLinha = 0; 
        int maiorColuna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { 
                if(matriz[i][j] > maiorValor){
                    maiorValor = matriz[i][j];
                    maiorLinha = i;
                    maiorColuna = j; 
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior matriz: " + maiorValor);
        System.out.println("Maior linha: " + maiorLinha + ", maior coluna: " + maiorColuna);


    }
}

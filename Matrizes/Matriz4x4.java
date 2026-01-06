package Matrizes;

import java.util.Scanner;

public class Matriz4x4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linhas = in.nextInt();

        System.out.println("Digite o número de colunas: ");
        int colunas = in.nextInt();


        int [][] matriz = new int[linhas][colunas];

        System.out.println("Matriz Gerada: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { // Segundo for deve levar o [i].length pq faz a leitura de quantas colunas a linha possui  
                matriz[i][j] = (int)(Math.random() * 15);// Classe Math/ Metodo Random = Números aleatórios, int trunca no seu valor decimal após ser multiplicado
                System.out.print(matriz [i][j] + " " );
            }
            System.out.println();
        }

        int cont = 0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > 10){ 
                    cont++;
                }
            }
        }
        System.out.println("Quantidade de valores maior que 10: " + cont);
        in.close();
    }
}

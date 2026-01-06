public class Ex6 {
    public static void main(String[] args) {
        
        System.out.println("Primeira matriz: ");

        int [][] matriz1 = new int [4][4];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int)(Math.random()* 10);
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Segunda matriz: ");
        int [][] matriz2 = new int [4][4];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int)(Math.random()* 10);
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Nova matriz: ");
        int[][] novaMatriz = new int[4][4];
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if(matriz1[i][j] > matriz2[i][j]){
                    novaMatriz[i][j] = matriz1[i][j];
                }else{
                    novaMatriz[i][j] = matriz2[i][j];
                }
                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

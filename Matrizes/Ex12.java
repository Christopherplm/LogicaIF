public class Ex12 {
    public static void main(String[] args) {
         
        int [][] matrizOriginal = new int[3][3];

        System.out.println("Matriz original:");
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizOriginal[i][j] = (int)(Math.random() * 10);
                System.out.print(matrizOriginal[i][j] + " ");
            }
            System.out.println();
        }

        int [][] matrizTransposta = new int[3][3];
        for (int i = 0; i < matrizOriginal.length; i++) {
            for (int j = 0; j < matrizOriginal[i].length; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        System.out.println("\nMatriz transposta:");
        for ( int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[i].length; j++) {
               System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }
    }
}

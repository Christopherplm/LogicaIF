public class Ex5 {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        int linhaAleatoria = (int) (Math.random() * 5);
        int colunaAletorioa = (int) (Math.random() * 5);
        int x = matriz[linhaAleatoria][colunaAletorioa];

        System.out.println("Valor a buscar: " + x);

        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Encontrado na posicação [" + i + "," + j + "]");
                    encontrado = true;
                    if (encontrado == false) {
                        System.out.println("Não encontrado.");
                    }
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

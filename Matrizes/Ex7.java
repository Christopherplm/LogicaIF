public class Ex7 {
    public static void main(String[] args) {
        
        int [][] matriz = new int [10][10];

        System.out.println("Primeira matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz resultante");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i < j){
                    matriz[i][j] = (2 * i) + (7 * j) - 2;
                }else if (i == j) {
                   matriz[i][j] = (3 * i * i ) - 1;
                }else {
                    matriz[i][j] = (4 * i * i * i) - (5 * j * j) + 1;
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

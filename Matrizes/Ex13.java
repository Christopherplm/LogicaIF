public class Ex13 {
    public static void main(String[] args) {

        int [][] matriz = new int [4][4];
        
        System.out.println("Primeira matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*20) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i < j){
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("Segunda matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

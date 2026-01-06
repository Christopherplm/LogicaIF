public class Ex1 {
    public static void main(String[] args) {
         
        int [][] matriz = new int[4][4];

        for ( int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() * 15); 
            }
        }

        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > 10){
                    cont++;
                }
            }
        }

        System.out.println("Foram encontrados " + cont + " maiores que 10 na matriz.");
        for ( int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

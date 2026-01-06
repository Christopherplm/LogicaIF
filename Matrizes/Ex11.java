public class Ex11 {
    
    public static void main(String[] args) {
        
        int [][] matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random() *10);
            }
        }

        System.out.println("Soma da superior: ");
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length -1) {
                    soma = soma + matriz[i][j];                    
                }else{
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma da diagonal secundaria: " + soma);
    }
}

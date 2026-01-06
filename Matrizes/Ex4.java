public class Ex4 {
    public static void main(String[] args) {
        
        int [][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = (int)(Math.random() * 10);
            }
        }
        
        int maiorDigito = matriz[0][0]; 
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if( matriz[i][j] > maiorDigito){
                    maiorDigito = matriz[i][j];
                }
            }
        }
        
        System.out.println("O maior digito da matriz 4x4 é: " + maiorDigito);
        System.out.print("Localização(ões): ");
        
        int contador = 0; 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == maiorDigito) {
                    if(contador > 0){
                        System.out.print(", ");
                    }
                    System.out.print("[" + i + "," + j + "]");
                    contador++;
                }
            }
        }
        
        System.out.println("\nAparece: " + contador + " vez(es)");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }        
    }
}
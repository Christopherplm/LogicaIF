public class Ex14 {
    public static void main(String[] args) {
        
        int [][] cartela = new int [5][5];
        
        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {

                boolean repetido = true;
                while (repetido) {
                    int num = (int)(Math.random() * 100);
                    
                    repetido = false;
                    for (int k = 0; k < cartela.length; k++) {
                        for (int l = 0; l < cartela[k].length; l++) {
                            if (cartela[k][l] == num) {
                                repetido = true;
                            }
                        }
                    }
                    
                    if (!repetido) {
                        cartela[i][j] = num;
                    }
                }
            }
        }
        
        System.out.println("CARTELA DE BINGO:");
        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                System.out.printf(cartela[i][j] + " ");
            }
            System.out.println();
        }
    }
}
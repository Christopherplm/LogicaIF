package Desenhos;

public class QuadradoOco {
    public static void main(String[] args) {

        int i, j, linha = 4, coluna = 5;

        for(i = 0; i < linha; i++){
            for(j = 0; j < coluna; j++){
                if (i == 0 || i == linha - 1 || j == 0 || j == coluna - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

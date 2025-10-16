package Desenhos;

public class QuadradoOco {
    public static void main(String[] args) {

        int linha = 4, coluna = 5;

        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
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

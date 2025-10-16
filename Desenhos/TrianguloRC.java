package Desenhos;

public class TrianguloRC {
    public static void main(String[] args) {
        
        int linha = 4;

        for (int i = 0; i <= linha; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

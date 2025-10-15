package Desenhos;

public class QuadradoCheio {
    public static void main(String[] args) {
        
        int linha = 4;
        int coluna = 4; 

        for(int i = 0; i <= linha; i++ ){
            for(int j= 0; j <= coluna; j++){
                System.out.print("X");
            }
            System.out.println();
        }   
            
    }
}

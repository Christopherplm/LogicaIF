import java.util.Scanner;

public class V2 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Quantidade de lançamentos: ");
        
        int lancamentos = in.nextInt();
        int [] contRepeticao = new int[7];

        System.out.println("Digite os resultados dos " +  lancamentos + " lançamentos:");

        for(int i = 0; i < lancamentos; i++){
            int face = in.nextInt();
            contRepeticao[face]++;
        }

        System.out.println("\nNúmero de ocorrências de cada face:");
        for(int face = 1; face <=6; face++){
            System.out.println("Face " + face + ": " + contRepeticao[face] + " vezes");
            if(contRepeticao[face] >= 3){
                System.out.println("Contagem anormal");
            }
        }

        in.close();
    }


}
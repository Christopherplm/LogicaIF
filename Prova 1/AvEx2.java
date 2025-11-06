import java.util.Scanner;

public class AvEx2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int qntAtual, qntMax, qntMin, qntMedia; 

        System.out.println("Informe a: Quantidade atual em estoque, quantidade máxima e a quantidade mínima: ");

        qntAtual = in.nextInt();
        qntMax = in.nextInt();
        qntMin = in.nextInt();

        qntMedia = (qntMax + qntMin)/ 2;

        if (qntAtual >= qntMedia ) {
            System.out.println("Não efetuar compra");
        }else{
            System.out.println("Efetuar compra");
        }
        in.close();
    }
}

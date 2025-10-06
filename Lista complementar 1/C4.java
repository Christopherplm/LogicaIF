import java.util.Scanner;

public class C4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int numMaior, numMedio, numMenor; 

        System.out.println("Digite 3 números para saber o maior entre os tres");
        numMaior = in.nextInt();
        numMedio = in.nextInt();
        numMenor = in.nextInt();

        if (numMaior > numMedio && numMaior > numMenor) {
            System.out.println("O maior número é: " + numMaior);
        } else if (numMedio > numMaior && numMedio > numMenor) {
            System.out.println("O maior número é: " + numMedio);
        } else {
            System.out.println("O maior número é: " + numMenor);
        }
    }

}

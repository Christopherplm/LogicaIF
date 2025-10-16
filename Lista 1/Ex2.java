import java.util.Scanner;

public class Ex2 {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                Double valorDeEntrada, valorAcrescido;

                System.out.println("Insera um número real para saber o valora atualizado com 20%");
                valorDeEntrada = in.nextDouble();

                valorAcrescido = valorDeEntrada * 1.05;
                System.out.println("o valor atualizado com 20% é: " + valorAcrescido);
        in.close();
        }
        
}

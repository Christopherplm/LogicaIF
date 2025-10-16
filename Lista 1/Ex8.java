import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

            float numEleitores, votosValid, votosBranco, votosNull, perVotosValid, perVotosBrancos, perVotosNull; 

        System.out.println("Resultado da eleição de acordo com os dados.");
        System.out.println("Informe número de eleitores: ");
            numEleitores = in.nextFloat();
        System.out.println("Informe número de votos válidos: ");
            votosValid = in.nextFloat();
        System.out.println("Informe número de votos brancos: ");
            votosBranco = in.nextFloat();
        System.out.println("Informe número de votos núlos: ");
            votosNull = in.nextFloat();


        perVotosValid = votosValid / numEleitores * 100;
        perVotosBrancos = votosBranco / numEleitores * 100;
        perVotosNull = votosNull / numEleitores * 100;

        System.out.printf("Percentual de votos válidos: %.2f%%\n", perVotosValid);
        System.out.printf("Percentual de votos brancos: %.2f%%\n", perVotosBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", perVotosNull);
        
        in.close();
    }
}

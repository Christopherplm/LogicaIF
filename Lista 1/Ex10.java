import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valorIng, nSocios, nNaoPagantes, nPagantes, publicoTotal; 
        double rendaSocios, rendaPagantes, rendaTotal, descontoSocios, isencaoNaoPagantes, valorNaoArrecadado;
        
        System.out.println("Valor do ingresso: ");
            valorIng = in.nextInt();
        System.out.println("Número de sócios: ");
            nSocios = in.nextInt();
        System.out.println("Número de não pagantes: ");
            nNaoPagantes = in.nextInt();
        System.out.println("Número de pagantes: ");
            nPagantes = in.nextInt();
        
        // Público total
        publicoTotal = nSocios + nNaoPagantes + nPagantes;
        System.out.println("Número total de público: " + publicoTotal);
        
        // Renda total 
        rendaSocios = nSocios * valorIng * 0.7;
        rendaPagantes = nPagantes * valorIng;
        rendaTotal = rendaSocios + rendaPagantes;
        System.out.println("Renda total do evento: R$ " + rendaTotal);

        // Valor não arrecadado
        descontoSocios = nSocios * valorIng * 0.3;
        isencaoNaoPagantes = nNaoPagantes * valorIng;
        valorNaoArrecadado = descontoSocios + isencaoNaoPagantes;
        System.out.println("Valor não arrecadado devido a descontos e isenções: R$ " + valorNaoArrecadado);
        /*
        O 0.7 representa 70% do valor do ingresso, que é quanto o sócio paga após o desconto de 30%.
        O 0.3 representa 30% do valor do ingresso, que é o valor do desconto dado ao sócio.

        Ou seja:

        Sócio paga 70% do valor → valorIng × 0.7
        Desconto para o sócio é 30% do valor → valorIng × 0.3
         */
    }
}

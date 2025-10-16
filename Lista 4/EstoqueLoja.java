import java.util.Scanner;

public class EstoqueLoja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int totalMercadorias;
        double valorMercadoria;
        double valorTotal = 0;
        double media;
        
        System.out.print("Digite o número total de mercadorias no estoque: ");
        totalMercadorias = in.nextInt();
        
        for (int i = 1; i <= totalMercadorias; i++) {
            System.out.print("Digite o valor da mercadoria " + i + ": R$ ");
            valorMercadoria = in.nextDouble();
            valorTotal = valorTotal + valorMercadoria;
        }
        
        media = valorTotal / totalMercadorias;
        
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Valor total em estoque: R$ " + valorTotal);
        System.out.println("Média dos valores das mercadorias: R$ " + media);
        
        in.close();
    }
}
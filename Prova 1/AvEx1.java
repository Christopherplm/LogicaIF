import java.util.Scanner;

public class AvEx1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float valorIng, rendaTotal, rendaNãoArrecadada; 
        int qntSocios, qntMenor10anos, qntPagantes, pubTotal; 

        System.out.println("Informe valor do ingresso, sócios, menores de 10 anos e pagantes");

        valorIng = in.nextFloat();
        qntSocios =  in.nextInt();
        qntMenor10anos = in.nextInt();
        qntPagantes = in.nextInt();

        System.out.println("Esse é o valor do Ingresso: " + valorIng);
        System.out.println("Essa é a quantidade de Sócios: " + qntSocios);
        System.out.println("Essa é a quantidade de Menores de 10 anos: " + qntMenor10anos);
        System.out.println("Essa é a quantidade de Pagantes no valor normal: " + qntPagantes);

        pubTotal = qntSocios + qntMenor10anos + qntPagantes;
        rendaTotal = valorIng * qntPagantes + valorIng * qntSocios * 0.7f;
        rendaNãoArrecadada = valorIng * qntMenor10anos + qntSocios * valorIng * 0.3f;

        System.out.println("Público total: " + pubTotal);
        System.out.println("Renda total: " + rendaTotal);
        System.out.println("Valor não arrecadado: " + rendaNãoArrecadada);
        in.close();
    }
}
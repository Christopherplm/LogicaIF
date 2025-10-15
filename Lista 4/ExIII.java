import java.util.Scanner;

public class ExIII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.println("Digite um número inteiro para saber se ele é primo ou não: ");
            int number = in.nextInt();

        int divisores = 0; 
        
        for(int i = 1; i <= number; i++){
            if( number % i == 0){
                System.out.println(i);
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println(number + " É primo");
        } else {
            System.out.println(number + " Não é primo");
        }
        in.close();
    }
}

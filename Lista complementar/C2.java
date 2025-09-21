import java.util.Scanner;

public class C2 {
    public static void main (String[] args) {
        Scanner  in = new Scanner(System.in);
        
        int idade;

        System.out.println("Indique a usa idade: ");
        idade = in.nextInt(); 

            if (idade <= 12) {
                System.out.println("Você é criança!");
            }
             else if (idade >= 13 && idade <= 17) {
                System.out.println("Você é adolescente!");
            }
             else if (idade >= 18 && idade <= 59) {
                System.out.println("Você é adulto!");
            }else { 
                System.out.println("Você é idoso!");
            }
    }
}

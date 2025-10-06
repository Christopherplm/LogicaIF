import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         float soma = 0;
         int contador = 0; 

         while (contador < 5) {
            float nota = in.nextFloat();
            soma = soma + nota;
            contador++;
         }

         float media = soma / 5;
         System.out.println(media);
    }
}

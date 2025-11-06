import java.util.Scanner;

public class AvEx6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float n1, n2, avOptativa, media = 0; 

        System.out.println("Envie as notas das avaliações: ");

        n1 = in.nextFloat();
        n2 = in.nextFloat();
        avOptativa = in.nextFloat();

        if (avOptativa == -1){
            media = (n1 + n2)/ 2;
        }else if(n1 < avOptativa){
            media = (avOptativa + n2) / 2;
        }else if (n2 < avOptativa){
            media = (avOptativa + n1) / 2;
        }

        if (media >= 6) {
            System.out.println("Aprovado com média: " + media);
        } else if (media >= 3) {
            System.out.println("Reprovado com média: " + media);
        }else{
            System.out.println("Exame: " + media);
        }
        in.close();
    }
}

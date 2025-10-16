import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            float homems, mulheres, crianças, gHomem, gMulher, gCrianças, gTotal;

        System.out.println("Informe o número de homens: ");
            homems = in.nextFloat();
        System.out.println("Informe o número de mulheres: ");
            mulheres = in.nextFloat();
        System.out.println("Informe o número de crianças: ");
            crianças = in.nextFloat();

        gHomem = homems * 400;
        gMulher = mulheres * 320;
        gCrianças = crianças * 200;

        gTotal = (gHomem + gMulher + gCrianças) * 1.2f;

        System.out.printf("Serão necessários %.2fkg de carne para o churrasco", gTotal / 1000);
        

        in.close();
    }
}

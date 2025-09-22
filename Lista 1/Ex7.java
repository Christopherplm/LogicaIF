import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float distanciaTrj, velocidadeMedia, tempo;

        System.out.println("Diga a distância do seu trajeto partindo do seu ponto de partida: ");
            distanciaTrj = in.nextFloat();
        System.out.println("Diga a velocidade média da viagem: ");
            velocidadeMedia = in.nextFloat();

        tempo = distanciaTrj / velocidadeMedia;

        // %.2f indica que o valor será mostrado com duas casas decimais
        System.out.printf("O tempo estimado da viagem é: %.2f horas\n", tempo);
    }
}

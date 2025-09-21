import java.util.Scanner;

public class C16 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int min, horas, extra; 

        System.out.println("Digite o tempo em minutos que o carro ficou estacionado: ");
        min = in.nextInt(); 
        horas = min / 60;
        extra = min % 60;   

        if (min <= 15) {
            System.out.println("O valor a ser pago é Grátis");
        } else if (min <= 60) {
            System.out.println("O valor a ser pago é R$ 5,00");
        } else if (min <= 180) { // até 3 horas
            System.out.println("O valor a ser pago é R$ 10,00");
        } else {
            int horasExtras = horas - 3;
            if (extra > 0) {
                horasExtras += 1; // arredonda para cima se tiver minutos extras
            }
            double valor = 10 + horasExtras * 2;
            System.out.println("O valor a ser pago é R$ " + String.format("%.2f", valor).replace('.', ','));
        }

        in.close();
    }
}
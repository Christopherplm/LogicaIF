import java.util.Scanner;

public class AvEx5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int HInicial, MInicial, HFinal, MFinal; 

        System.out.println("Diga a hora inicial, minuto inicial, hora final, minuto final: ");
        
        HInicial = in.nextInt();
        MInicial = in.nextInt();

        HFinal = in.nextInt(); 
        MFinal = in.nextInt();

        int tempPermanencia = (HFinal * 60) + MFinal - (HInicial * 60) + MInicial ; 

        if (tempPermanencia <= 15 ){
            System.out.println("Saída gratuita");
        } else if (tempPermanencia <= 60){
            System.out.println("Valor a pagar: R$ 5,00");
        } else if (tempPermanencia <= 180){
            System.out.println("Valor a pagar: R$ 10,00");
        }else {
            
            int tempoExtra = tempPermanencia - 180;
            int tempoExtraHoras = tempoExtra/60;

            if (tempoExtraHoras * 60 < tempoExtra) {
                tempoExtraHoras = tempoExtraHoras + 1;
            }

            int valor = 10 + 2 * tempoExtraHoras;
            System.out.println("VALOR FINAL " + valor);
        }
        in.close();
    }
}

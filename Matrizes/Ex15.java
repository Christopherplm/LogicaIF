public class Ex15 {
    public static void main(String[] args) {
        
        char [][] respostas = new char[5][10];
        char [] gabarito = new char[10];
        int [] resultado = new int [5];

        // Atribui 0-3 para a-d
        char [] opcoes = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < opcoes.length; i++) {
            gabarito[i] = opcoes[(int)(Math.random() * 4)];
        }
        
        for (int i = 0; i < respostas.length; i++) {
            for (int j = 0; j < respostas[i].length; j++) {
                respostas[i][j] = opcoes[(int)(Math.random() * 4)];
            }
        }

        for (int i = 0; i < respostas.length; i++) {
            int pontos = 0;
            for (int j = 0; j < respostas[i].length; j++) {
                if (respostas[i][j] == gabarito[j]) {
                pontos++;
                }
            }       
            resultado[i] = pontos;
        }

        for (int  i = 0; i < resultado.length; i++) {
        System.out.println("Aluno " + (i+1) + ": " + resultado[i] + " pontos");
    }
    }
}

public class MatrizAula1 {
    public static void main(String[] args) {
        
        int [][] m = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            m[i][0] = 10 + i*10;
            m[i][1] = 11 + i*10;
            m[i][2] = 12 + i*10;
            m[i][3] = 13 + i*10;
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

    }
}

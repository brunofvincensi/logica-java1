package orientaoobjeto.matrizes;

public class Ex04 {
    public static void main(String[] args) {
        int m = 5;
        int[][] mat = new int[5][5];

        for(int i=0; i<m; i++){
            mat[3][i] = 10;


        }
        for(int i=0; i<m; i++){

            mat[i][4] = 10*i;
            mat[i][i] = 50;
        }

        for (int i = 0; i < 5; i++) {// percorrer linhas
            for (int j = 0; j < 5; j++) {// percorrer colunas
                System.out.println("Posicao [" + i + "] [" + j + "] " + mat[i][j]);
            }
        }
    }
}

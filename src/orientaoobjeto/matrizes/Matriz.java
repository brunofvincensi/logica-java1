package orientaoobjeto.matrizes;

public class Matriz {
    public static void main(String[] args) {

        int[][] matriz = new int[2][2];

        matriz[0][0] = 18;
        matriz[1][0] = 65;

        matriz[0][1] = 2;
        matriz[1][1] = 6;

        for (int i = 0; i < 2; i++) {// percorrer linhas
            for (int j = 0; j < 2; j++) {// percorrer colunas
                System.out.println("Posicao [" + i + " ] [ " + j + "] " + matriz[i][j]);
            }
        }
    }
}

package orientaoobjeto.matrizes;

public class Ex02 {
    public static void main(String[] args) {
        int n = 3;
        int[][] mat = new int[5][5];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){

                mat[i][j] = 1 + i + j;
                System.out.println(mat[i][j]);
            }
        }
    }
}

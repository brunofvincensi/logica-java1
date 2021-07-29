package orientaoobjeto.matrizes;

public class Ex03 {
    public static void main(String[] args) {
        int m = 2;
        int n = 4;
        int x = 0;
        int[][] mat = new int[5][5];
        for(int i = 0; i<m; i++){
            x = x + i;
            for(int j = 0; j<n; j++){
                x = x + j;
                mat[i][j] = x;
            }
        }

        for(int i = 0; i<m; i++){
            x = x + i;
            for(int j = 0; j<n; j++){

                System.out.println(mat[i][j]);
            }
        }
    }
}

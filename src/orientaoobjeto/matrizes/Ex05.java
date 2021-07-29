package orientaoobjeto.matrizes;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cont = 0;

        int[][] matriz = new int[N][N];
        for (int i = 0; i < N; i++) {// percorrer linhas
            for (int j = 0; j < N; j++) {// percorrer colunas
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {// percorrer linhas
            for (int j = 0; j < N; j++) {// percorrer colunas
               if(i == j){
                   System.out.println(matriz[i][j]);
               }
               if(matriz[i][j] < 0){
                   cont++;

               }

            }
        }
        System.out.println("Quantidade de negativos = " + cont);




        sc.close();
    }
}

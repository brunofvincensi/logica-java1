package orientaoobjeto.logica;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numeros = new int[N];
        for(int i = 0; i<N; i++){

            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i<N; i++){

            if(numeros[i]<0){
                System.out.println(numeros[i]);
            }
        }

     sc.close();
    }
}

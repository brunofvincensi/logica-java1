package orientaoobjeto.logica;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] numeros = new double[N];

        double soma = 0.0;
        double vezes = 1.0;

        for(int i = 0; i<N; i++){

            numeros[i] = sc.nextDouble();
            soma = soma + numeros[i];
            vezes = vezes * numeros[i];

        }

        for(int i = 0; i<N; i++){

            System.out.println(numeros[i]);

        }
        System.out.println(vezes);
        System.out.println(soma);


    }
}

import java.util.Scanner;

public class Ex1080 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X;
        int maior = 0;
        int posicao = 0;

        for(int i = 1; i <= 100; i++){

            X = sc.nextInt();

            if(X > maior){

                maior = X;
                posicao = i;
            }

        }
        System.out.println(maior);
        System.out.println(posicao);


        sc.close();
    }
}

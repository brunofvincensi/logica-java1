import java.util.Scanner;

public class Uri1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = N;
        int cont1 = 0;
        int cont2 = 0;


        if(N<=10000) {
            for (int i = 1; i <= X; i++) {

                N = sc.nextInt();
                if (N >= 10 && N <= 20) {
                    cont1++;
                } else {
                    cont2++;
                }

            }
            System.out.println(cont1 + " in");
            System.out.println(cont2 + " out");
        }

        sc.close();

    }
}

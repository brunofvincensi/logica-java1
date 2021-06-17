import java.util.Scanner;

public class Uri1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i<=N; i++){

            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double x3 = sc.nextDouble();

            x1 = x1*0.2;
            x2 = x2*0.3;
            x3 = x3*0.5;

            double xt = x1 + x2 + x3;

            System.out.printf("%.1f%n", xt);

        }


        sc.close();
    }
}

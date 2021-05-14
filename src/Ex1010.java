import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int c1 = scanner.nextInt();
        int n1 = scanner.nextInt();
        double v1 = scanner.nextDouble();

        int c2 = scanner.nextInt();
        int n2 = scanner.nextInt();
        double v2 = scanner.nextDouble();

        double vf = n1*v1 + n2*v2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", vf);

        scanner.close();





    }


}

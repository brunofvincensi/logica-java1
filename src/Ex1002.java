import java.util.Locale;
import java.util.Scanner;
public class Ex1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double n = 3.14159;
        double R = scanner.nextDouble();
        double A = Math.pow(R, 2) * n;

        System.out.printf("A=%.4f%n", A);

        scanner.close();


    }



}

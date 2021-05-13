import java.util.Scanner;
import java.util.Locale;

public class Ex1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double R = scanner.nextDouble();
        double A = 3.14159 * Math.pow(R, 2);

        System.out.println("A = " + A);

        scanner.close();


    }



}

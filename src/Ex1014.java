import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();
        double l = scanner.nextDouble();

        double kml = d / l;

        System.out.printf("%.3f km/l%n", kml);

        scanner.close();
















        scanner.close();
    }
}

import java.util.Locale;
import java.util.Scanner;



public class Ex1006 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double x = ( 2.0 * A)/10;
        double y = (3.0 * B)/10;
        double z = (5.0 * C)/10;

        double r = x + y + z;

        System.out.printf("MEDIA = %.1f%n", r);





        scanner.close();
    }
}

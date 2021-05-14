import java.util.Locale;
import java.util.Scanner;



public class Ex1005 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();

        double x = (3.5 * n1)/10;

        double y = (7.5 * n2)/10;

        double r = x + y;

        double r2 = (r * 10)/11;



        System.out.printf("MEDIA = %.5f%n", r2);









        scanner.close();


    }
}

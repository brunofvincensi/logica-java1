import java.util.Scanner;
import java.util.Locale;


public class Ex1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double pi =  3.14159;

        double R = scanner.nextDouble();

        double volume = (4.0/3) * pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();


    }
}

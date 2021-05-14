import java.util.Locale;
import java.util.Scanner;



public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int vm = scanner.nextInt();

        double kml = 12;

        double litros = vm/kml * t;

        System.out.printf("%.3f%n", litros);








        scanner.close();

    }




}

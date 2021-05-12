import java.util.Locale;
import java.util.Scanner;

public class TesteEmCasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Cateto oposto: ");
        double oposto = scanner.nextDouble();

        System.out.println("Cateto adjacente: ");
        double adjacente = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(oposto, 2) + Math.pow(adjacente, 2));

        System.out.printf("O valor da hipotenusa é: " + "%.1f%n", hipotenusa);




        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double A = Math.pow(x,y);

        System.out.println(x + "elevado a" + y + "=" + A);

        System.out.printf("%.2f elevado a %.2f = %.2f", x, y, A);

        double w = scanner.nextDouble();
        double W = Math.abs(w);
        System.out.println(w);





    }



}

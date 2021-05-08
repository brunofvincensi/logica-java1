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

        double hipotenusa = Math.sqrt(adjacente * adjacente + oposto * oposto);

        System.out.printf("O valor da hipotenusa é: " + "%.1f%n", hipotenusa);




    }



}

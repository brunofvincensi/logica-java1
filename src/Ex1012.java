import java.util.Scanner;
import java.util.Locale;


public class Ex1012 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double pi =  3.14159;


        double A = scanner.nextDouble();

        double B = scanner.nextDouble();

        double C = scanner.nextDouble();

        double triangulo = (A * C)/2.0;

        double circulo = Math.pow(C, 2) * pi;

        double trapezio = ((A+B)*C)/2.0;

        double quadrado = B*B;

        double retangulo = A*B;

        System.out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", triangulo, circulo, trapezio, quadrado, retangulo);

        scanner.close();
    }
}

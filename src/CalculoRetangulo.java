import java.util.Scanner;

public class CalculoRetangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Lado 2: ");
        double lado2 = scanner.nextDouble();


        double area = lado1 * lado2;
        double perimetro = 2 * lado1 + 2 * lado2;
        double diagonal = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));

        System.out.printf("Area: %.2f%nPerimetro: %.2f%nDiagonal: %.2f%n", area, perimetro, diagonal);

        scanner.close();





    }
}

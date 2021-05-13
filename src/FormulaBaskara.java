import java.util.Scanner;
public class FormulaBaskara {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o a ");
        double a = scanner.nextDouble();

        System.out.println("Digite o b ");
        double b = scanner.nextDouble();

        System.out.println("Digite o c ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2.0) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta))/(2.0 * a);
        double x2 = (-b - Math.sqrt(delta))/(2.0 * a);

        System.out.printf("O x1 é %.2f e o x2 é %.2f", x1, x2);




    }

}

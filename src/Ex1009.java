import java.util.Scanner;
import java.util.Locale;



public class Ex1009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nome = scanner.nextLine();

        double salario = scanner.nextDouble();

        double vendas = scanner.nextDouble();

        double salarioFinal = salario + vendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

        scanner.close();































    }
}

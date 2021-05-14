import java.util.Scanner;
import java.util.Locale;

public class Ex1008 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int num = scanner.nextInt();
        int horasTrabaho = scanner.nextInt();
        double salarioHora = scanner.nextDouble();

        double salario = horasTrabaho * salarioHora;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        scanner.close();


    }
}

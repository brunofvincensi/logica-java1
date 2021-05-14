import java.util.Locale;
import java.util.Scanner;

public class Ex1016 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int r = 2 * n;

        System.out.println(r + " minutos");

        scanner.close();

    }

}

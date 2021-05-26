import java.util.Locale;
import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = scanner.nextInt();
        int r = N % 60;
        int r2 = (N / 60) % 60;
        int r3 = (N / 60) / 60;


        System.out.printf("%d:%d:%d", r3, r2, r);

        scanner.close();

    }
}

import java.util.Locale;
import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int nf = n1*n2;

        System.out.println("PROD = " + nf);

        scanner.close();














    }


}

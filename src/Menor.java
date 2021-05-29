import java.util.Locale;
import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if( n1<n2 && n1<n3 ){
            System.out.println("Menor: " + n1);

            
        }
        else if ( n2 < n3 ){
            System.out.println("Menor" + n2 );

        }
        else
            System.out.println("Menor" + n3 );



        scanner.close();
    }
}

import java.util.Scanner;
public class EntradaDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// quand            //
// String S = scanner.next();

        char variavelQueRecebeSomenteUmCaracter = scanner.next().charAt(0);

        System.out.println(variavelQueRecebeSomenteUmCaracter);


        int x;
        String s1,s2,s3;

        x = scanner.nextInt();
        scanner.nextLine();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();


        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}

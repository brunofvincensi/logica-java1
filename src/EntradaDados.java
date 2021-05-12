import java.util.Scanner;
public class EntradaDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// quando é botado apenas next na variavel String nao aparecera palavras depois do espaco.
        String S = scanner.next();

        char variavelQueRecebeSomenteUmCaracter = scanner.next().charAt(0);

        System.out.println(variavelQueRecebeSomenteUmCaracter);


        int x;
        String s1,s2,s3;

        x = scanner.nextInt();
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

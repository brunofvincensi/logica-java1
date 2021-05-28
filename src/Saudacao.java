import java.util.Locale;
import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int hora = scanner.nextInt();

        if(6 < hora && hora < 12){
            System.out.println("Bom dia");}
        else if(hora >= 12 && hora < 18){

            System.out.println("Boa tarde");
        }
        else{

            System.out.println("Boa noite");

        }









        scanner.close();


    }
}

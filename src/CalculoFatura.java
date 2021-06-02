import java.util.Scanner;

public class CalculoFatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minutos = scanner.nextInt();

        double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100 ) * 2.0;
        }
        System.out.printf("Valor da conta =  R$ %.2f%n", conta);
        System.out.println("fim do programa");
        scanner.close();
    }
}
import java.util.Locale;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double peso = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double imc = peso/ (altura * altura);

        System.out.printf("Imc: %.2f%n", imc);

        if(imc<18.5){
            System.out.println("Magreza");

        }
        else if(imc>=18.5 && imc < 24.9){
            System.out.println("Normal");}

        else if(imc>=24.9 && imc<=30.0){

            System.out.println("Sobrepeso");
        }

        else
            System.out.println("Obesidade");







        scanner.close();

    }
}

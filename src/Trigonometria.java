import java.util.Scanner;
import java.util.Locale;

public class Trigonometria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Angulo: ");
        double angulo = scanner.nextDouble();

        System.out.println("Cateto Adjacente: ");
        double adjacente = scanner.nextDouble();

        System.out.println("Cateto Oposto: ");
        double oposto = scanner.nextDouble();

        System.out.println("Hipotenusa");
        double hipotenusa = scanner.nextDouble();

        double hip = oposto/Math.sin(Math.toRadians( angulo ));




        if(hipotenusa == 0.0F)

            if(adjacente == 0.0F)
                System.out.printf("Hipotenusa: ", hip);








        scanner.close();








    }




}

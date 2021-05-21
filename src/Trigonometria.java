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

        System.out.println("Hipotenusa: ");
        double hipotenusa = scanner.nextDouble();

        double hip = oposto/Math.sin(Math.toRadians( angulo ));

        double adj = Math.sqrt(Math.pow(hip, 2) - Math.pow(oposto, 2));

        double hip2 = adjacente/Math.cos(Math.toRadians( angulo ));

        double ops = Math.sqrt(Math.pow(hip2, 2) - Math.pow(adjacente, 2));

        double diagonal = Math.sqrt(Math.pow(adjacente, 2) + Math.pow(oposto, 2));




        if(hipotenusa == 0.0F) {

            if (adjacente == 0.0F){
                System.out.printf("Hypotenuse: %.2f%nAdjacente: %.2f%n", hip, adj);


            }

            if (oposto == 0.0F){
                System.out.printf("Hypotenuse: %.2f%nOposto: %.2f%n", hip2, ops);


            }





           }
        else

            System.out.println("");












        scanner.close();








    }




}

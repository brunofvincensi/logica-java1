import java.util.Scanner;
import java.util.Locale;

public class Trigonometria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double hipotenusa, angulo, adjacente, oposto, hip, hip2, hip3, adj, adj2, adj3, ops, ops2, ops3;

        System.out.println("Angulo: ");
        angulo = scanner.nextDouble();

        System.out.println("Hipotenusa: ");
        hipotenusa = scanner.nextDouble();

        System.out.println("Cateto Adjacente: ");
        adjacente = scanner.nextDouble();

        System.out.println("Cateto Oposto: ");
        oposto = scanner.nextDouble();


        hip = oposto/Math.sin(Math.toRadians( angulo ));

        hip2 = adjacente/Math.cos(Math.toRadians( angulo ));

        hip3 = Math.sqrt(Math.pow(adjacente, 2) + Math.pow(oposto, 2));

        adj = Math.sqrt(Math.pow(hip, 2) - Math.pow(oposto, 2));

        adj2 = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(oposto, 2));

        adj3 = Math.cos(Math.toRadians(angulo))* hipotenusa;

        ops = Math.sqrt(Math.pow(hip2, 2) - Math.pow(adjacente, 2));

        ops2 = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(adjacente, 2));

        ops3 = Math.sin(Math.toRadians(angulo))* hipotenusa;



        if(hipotenusa == 0.0F) {

            if (adjacente == 0.0F){
                System.out.printf("Hipotenusa: %.2f%nCateto Adjacente: %.2f%n", hip, adj);


            }

            if (oposto == 0.0F){
                System.out.printf("Hipotenusa: %.2f%nCateto Oposto: %.2f%n", hip2, ops);


            }

            System.out.printf("Hipotenusa: %.2f%n", hip3);


           }
        else
            if(oposto != 0.0F){

                System.out.printf("Cateto Adacente: %.2f%n", adj2);

            }


            if(adjacente != 0.0F){


                System.out.printf("Cateto Oposto: %.2f%n", ops2);

            }

            System.out.printf("Cateto Oposto: %.2f%nCateto Adjacente: %.2f%n", ops3, adj3);



        scanner.close();



    }


}

package estruturarepeticao.enquanto;

import java.util.Scanner;

public class Ddd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = 0;
        int z = x;
        while(x>0){

            x = scanner.nextInt();
            if(x<0){
                x = 0;
            }
            else
            z = z + x;


            y = 1 + y;

        }
        if(x == 0) {
            double soma = (double) z / y;
            System.out.printf("%.2f%n", soma);
        }else{
            System.out.println("impossivel de calcular");
        }

        scanner.close();
    }
}

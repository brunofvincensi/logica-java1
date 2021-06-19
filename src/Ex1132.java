import java.util.Scanner;

public class Ex1132 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int maior;
        int menor;
        int cont = 0;
        int result;

        if(X>Y){
            maior = X;
            menor = Y;
        }
        else{
            maior = Y;
            menor = X;
        }

        while(menor < maior){

            menor++;

            if(menor%13 != 0){

                cont = cont + menor;

            }
        }
        if(X>Y){
            result = cont + Y  ;
        }
        else {
            result = cont + X;
        }

        System.out.println(result);


        sc.close();
    }
}
import java.util.Scanner;

public class Ex1092 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int quant;
        String animal;
        int totalC = 0;
        int totalR = 0;
        int totalS = 0;
        int totalCobaias;


        for(int i = 1; i<=N; i++) {

            quant = sc.nextInt();
            animal = sc.next();

            if (animal.equals("C")) {
                totalC = totalC + quant;
            } else if (animal.equals("R")) {
                totalR = totalR + quant;
            } else if (animal.equals("S")) {
                totalS = totalS + quant;
            }


        }
        totalCobaias = totalS + totalC + totalR;


        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalC);
        System.out.println("Total de ratos: " + totalR);
        System.out.println("Total de sapos: " + totalS);


        sc.close();

    }
}

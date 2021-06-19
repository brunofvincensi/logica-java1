import java.util.Scanner;

public class Ex1142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i2;
        int i3;

        for(int i = 3; i<=N*4 - 1; i = i + 4){

            i2 = i-1;
            i3 = i-2;
            System.out.printf("%d %d %d PUM%n", i3, i2, i);
        }

        sc.close();
    }
}
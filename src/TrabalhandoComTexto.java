import java.util.Scanner;

public class TrabalhandoComTexto {

   public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite seu nome: ");
      String nome = scanner.nextLine();

      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();

      System.out.println("Digite seu peso: ");
      double peso = scanner.nextDouble();

      String valoresConcatenados = "Oi meu nome é " + nome + ", tenho " + idade + " anos e estou pesando " + peso;

      System.out.println(valoresConcatenados);






   }
}

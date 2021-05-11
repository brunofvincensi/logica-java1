import java.util.Scanner;

public class TrabalhandoComTexto {

   public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite seu nome: ");
      String nome = scanner.nextLine();

      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();

      System.out.println("Digite seu peso: ");
      double peso = scanner.nextDouble();

      System.out.println("Digite sua altura: ");
      double altura = scanner.nextDouble();

      double imc = peso / (altura * altura);

      String valoresConcatenados = "Oi meu nome é " + nome + ", tenho " + idade + " anos e estou pesando " + peso;

      System.out.printf("Oi meu nome é %s, tenho %d anos e estou pesando %.2f%n", nome, idade, peso);

      System.out.printf("Seu imc é " + "%.2f%n", imc);


      if (imc > 25)
         System.out.println("Voce precisa fazer uma dieta");
      else
         System.out.println("Voce ta de boas");


   }
}
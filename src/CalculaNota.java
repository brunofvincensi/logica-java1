/*

Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o
aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. Todos
os valores devem ter uma casa decimal.

 */

import java.util.Locale;
import java.util.Scanner;

public class CalculaNota {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a note 1");
        double n1 = scanner.nextDouble();
        System.out.println("Digite a note 2");
        double n2 = scanner.nextDouble();

        double notaFinal = (n1 + n2);

        System.out.printf("Nota final %.2f%n", notaFinal);

        if (notaFinal < 60.0) {
            System.out.println("Reprovado ");
        }

        scanner.close();
    }


}
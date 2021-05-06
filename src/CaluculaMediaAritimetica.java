/*
Suponha um programa que solicita ao usuario dois numeros e depois mostra a media aritimetica deles

Ex:
    *** ENTRADA DE DADOS ***
Digite o pripeiro numero: 3
Digite o segundo numero: 6

    *** PROCESSAMENTO ***
MEDIA = (3 + 60) / 2

    *** SAIDA DE DADOS ***
Media aritimetica: 4.5


 */
import java.util.Scanner;

public class CaluculaMediaAritimetica {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor ");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite os segundo valor " );
        double segundoNumero = scanner.nextDouble();

        double resultado = (primeiroNumero + segundoNumero) / 2;

        System.out.println("O resultado é " + resultado);
    }
}

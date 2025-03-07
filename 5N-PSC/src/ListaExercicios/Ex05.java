/*Usando a estrutura switch, proponha uma calculadora com as quatro operações
aritméticas básicas disponibilizadas ao usuário por um menu.*/
package ListaExercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculadora;

        System.out.println("Operações disponiveis:");
        System.out.println("soma");
        System.out.println("subtração");
        System.out.println("multiplicação");
        System.out.println("divisão");

        System.out.println("Escolha uma operação: ");
        calculadora = scanner.next();

        switch (calculadora){
            case "soma":
                double n1soma, n2soma;

                System.out.println("Valor de N1: ");
                n1soma = scanner.nextDouble();
                System.out.println("Valor de N2: ");
                n2soma = scanner.nextDouble();

                System.out.println("O valor da soma é: " + (n1soma + n2soma));
                break;
            case "subtração":
                double n1sub, n2sub;

                System.out.println("Valor de N1: ");
                n1sub = scanner.nextDouble();
                System.out.println("Valor de N2: ");
                n2sub = scanner.nextDouble();

                System.out.println("O valor da subtração é: " + (n1sub - n2sub));
                break;
            case "multiplicação":
                double n1mult, n2mult;

                System.out.println("Valor de N1: ");
                n1mult = scanner.nextDouble();
                System.out.println("Valor de N2: ");
                n2mult = scanner.nextDouble();

                System.out.println("O valor da multiplicação é: " + (n1mult * n2mult));
                break;
            case "divisão":
                double n1div, n2div;

                System.out.println("Valor de N1: ");
                n1div = scanner.nextDouble();
                System.out.println("Valor de N2: ");
                n2div = scanner.nextDouble();

                System.out.println("O valor da divisão é: " + (n1div / n2div));
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
